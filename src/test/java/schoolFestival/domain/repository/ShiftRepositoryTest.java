package schoolFestival.domain.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ShiftRepositoryTest {
	
	@Autowired
	ShiftRepository shiftRepository;

	@Test
	public void test() {
		shiftRepository.findAll();
	}

}
