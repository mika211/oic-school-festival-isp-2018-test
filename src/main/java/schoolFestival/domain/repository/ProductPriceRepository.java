package schoolFestival.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import schoolFestival.domain.model.Product;
import schoolFestival.domain.model.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Integer> {

	@Override
	@Query("from ProductPrice pr join fetch pr.product")
	List<ProductPrice> findAll();
	
}
