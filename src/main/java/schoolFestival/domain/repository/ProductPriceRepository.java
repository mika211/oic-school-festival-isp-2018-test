package schoolFestival.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import schoolFestival.domain.model.Product;
import schoolFestival.domain.model.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Integer> {

	@Override
	@Query(value="select * from t_product_price pr join t_product p on pr.product_id = p.id", nativeQuery=true)
	List<ProductPrice> findAll();
	
}
