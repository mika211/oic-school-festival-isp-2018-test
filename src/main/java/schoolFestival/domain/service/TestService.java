package schoolFestival.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schoolFestival.domain.model.Student;
import schoolFestival.domain.repository.StudentRepository;

@Service
public class TestService {
	
	@Autowired
	StudentRepository studentRepository;

	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}
	
}
