package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.SalesEntity;

public interface SalesRepository extends JpaRepository<SalesEntity, Integer> {

}
