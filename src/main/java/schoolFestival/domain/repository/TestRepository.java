package schoolFestival.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import schoolFestival.domain.model.TestModel;

@Mapper
public interface TestRepository {

	@Select(
			"select date_trunc('hour', w.datetime) as date, sum(w.amount) as amount"
			+ " from ("
			+ "select"
			+ " s.sales_at, (sum(p.price * sd.qty) - s.discount) as amount"
			+ " from sales s"
			+ " join sales_detail sd on s.id = sd.sales_id"
			+ " join product p on sd.product_id = p.id"
			+ " group by s.sales_at, s.discount"
			+ ") w"
			+ " group by 1"
			+ " order by 1"
			)
	List<TestModel> select();
	
}
