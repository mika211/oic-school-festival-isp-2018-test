package schoolFestival.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import schoolFestival.domain.model.TestModel;

@Mapper
public interface TestRepository {

	@Select("select id, name, price from product")
	List<TestModel> select();
	
	@Insert("insert into product (name, price) values (#{name}, #{price})")
	void insert(TestModel testModel);
	
}
