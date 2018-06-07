package schoolFestival.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoolFestival.domain.model.ProductPrice;
import schoolFestival.domain.model.Shift;
import schoolFestival.domain.model.Student;
import schoolFestival.domain.repository.ProductPriceRepository;
import schoolFestival.domain.repository.ShiftRepository;
import schoolFestival.domain.repository.StudentRepository;

@Service
public class TestService {
	
	@Autowired
	ProductPriceRepository productPriceRepository;
	
	public List<ProductPrice> findAll() {
		return productPriceRepository.findAlltest();
	}
	
}
