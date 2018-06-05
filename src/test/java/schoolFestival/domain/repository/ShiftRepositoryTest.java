package schoolFestival.domain.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ShiftRepositoryTest {
	
	@Autowired
	ShiftRepository shiftRepository;

	@Test
	public void test() {
		shiftRepository.findAll();
	}

}
