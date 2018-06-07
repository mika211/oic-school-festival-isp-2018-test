package schoolFestival.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoolFestival.domain.model.ProductPrice;
import schoolFestival.domain.model.TestModel;
import schoolFestival.domain.repository.ProductPriceRepository;
import schoolFestival.domain.repository.TestModelRepository;

@Service
public class TestService {
	
	@Autowired
	TestModelRepository repository;
	
	public List<TestModel> findAll() {
		return repository.findAll();
	}
	
}
