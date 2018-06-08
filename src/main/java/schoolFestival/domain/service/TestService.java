package schoolFestival.domain.service;

import java.util.List;

import schoolFestival.domain.model.TestModel;

public interface TestService {

	List<TestModel> findAll();
	
	void insert(TestModel testModel);
	
}
