package schoolFestival.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoolFestival.domain.model.ProductPrice;
import schoolFestival.domain.repository.ProductPriceRepository;

@Service
public class TestService {
	
	@Autowired
	ProductPriceRepository productPriceRepository;
	
	public List<ProductPrice> findAll() {
		return productPriceRepository.findAll();
	}
	
}
