package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
