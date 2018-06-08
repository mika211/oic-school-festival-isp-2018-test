package schoolFestival.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import schoolFestival.domain.model.TestModel;

@Mapper
public interface TestRepository {

	@Select("select s.id, sd.id as detailId, s.sales_at as salesAt, s.discount, sd.product_id as productId, sd.price, sd.qty from sales s join sales_detail sd on s.id = sd.sales_id")
	List<TestModel> findAll();
	
	@Select("select currval('sales_id_seq')")
	int currval();
	
	@Insert("insert into sales (discount) values #{discount}")
	void createSales(TestModel testModel);
	
	@Insert("insert into sales_detail (sales_id, product_id, price, qty) values (#{id}, #{productId}, #{price}, #{qty})")
	void createSalesDetail(TestModel testModel);
	
}
