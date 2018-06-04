package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.ShiftEntity;

public interface ShiftRepository extends JpaRepository<ShiftEntity, Integer> {

}
