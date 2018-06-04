package schoolFestival.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import schoolFestival.domain.model.StudentEntity;
import schoolFestival.domain.repository.StudentRepository;

@Service
@Transactional
public class TestServiceImpl implements TestService {
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<StudentEntity> findAllStudent() {
		return studentRepository.findAll();
	}

}
