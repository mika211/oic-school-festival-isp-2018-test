package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Integer> {

}
