package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Integer> {

}
