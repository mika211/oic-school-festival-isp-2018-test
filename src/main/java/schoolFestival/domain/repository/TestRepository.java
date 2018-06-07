package schoolFestival.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import schoolFestival.domain.model.TestModel;

@Mapper
public interface TestRepository {

	@Select("SELECT id, name FROM t_student")
	List<TestModel> select();
	
}
