package schoolFestival.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoolFestival.domain.model.TestModel;
import schoolFestival.domain.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestRepository testRepository;

	@Override
	public List<TestModel> findAll() {
		return testRepository.select();
	}

	@Override
	public void insert(TestModel testModel) {
		testRepository.insert(testModel);
	}

}
