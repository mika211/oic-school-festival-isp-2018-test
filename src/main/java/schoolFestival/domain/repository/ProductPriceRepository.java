package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import schoolFestival.domain.model.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Integer> {

}
