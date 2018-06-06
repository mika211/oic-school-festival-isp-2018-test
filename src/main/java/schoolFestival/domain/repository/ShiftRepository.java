package schoolFestival.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import schoolFestival.domain.model.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Integer> {

	@Override
	@Query(value="SELECT * FROM t_shift sh JOIN FETCH sh.student_id")
	List<Shift> findAll();
	
}
