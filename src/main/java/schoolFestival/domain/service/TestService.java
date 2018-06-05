package schoolFestival.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.stereotype.Service;

import schoolFestival.domain.model.Shift;
import schoolFestival.domain.model.Student;
import schoolFestival.domain.repository.ShiftRepository;
import schoolFestival.domain.repository.StudentRepository;

@Service
@DataJpaTest
public class TestService {
	
	@Autowired
	StudentRepository studentRepository;
	ShiftRepository shiftRepository;

	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}
	
	public List<Shift> findAllShift() {
		return shiftRepository.findAll();
	}
	
}
