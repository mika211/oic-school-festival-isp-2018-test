package schoolFestival.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import schoolFestival.domain.model.Student;

public interface StudentRepository /*extends JpaRepository<Student, Integer>*/ {
	
	@Query(value="select id, name from t_student")
	List<Student> findAll();

}
