package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.ProductPriceEntity;

public interface ProductPriceRepository extends JpaRepository<ProductPriceEntity, Integer> {

}
