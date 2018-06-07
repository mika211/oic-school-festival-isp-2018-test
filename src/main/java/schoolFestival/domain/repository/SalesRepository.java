package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer> {
	
}
