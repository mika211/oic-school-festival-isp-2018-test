package schoolFestival.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import schoolFestival.domain.model.TestModel;
import schoolFestival.domain.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestRepository testRepository;

	@Override
	public List<TestModel> findAll() {
		return testRepository.findAll();
	}

	@Override
	@Transactional
	public void insert(TestModel testModel) {
		testRepository.createSales(testModel);
		testModel.setId(testRepository.currval());
		testRepository.createSalesDetail(testModel);
	}

}
