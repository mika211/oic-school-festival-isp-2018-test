package schoolFestival.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.joda.time.LocalDateTime;

import schoolFestival.domain.model.TestModel;

@Mapper
public interface TestRepository {

	@Select(
			"SELECT"
			+ " s.datetime, (SUM(pp.price * sd.qty) - s.discount) AS amount"
			+ " FROM t_sales s"
			+ " JOIN t_sales_detail sd ON s.id = sd.sales_id"
			+ " JOIN t_product_price pp ON sd.product_price_id = pp.id"
			+ " GROUP BY s.datetime, s.discount"
			)
	@ResultType(LocalDateTime.class)
	List<TestModel> select();
	
}
