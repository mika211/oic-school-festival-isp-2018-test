package schoolFestival.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import schoolFestival.domain.model.Student;
import schoolFestival.domain.service.TestService;

@RestController
@RequestMapping("/")
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping
	public String test() {
		List<Student> list = testService.findAllStudent();
		StringBuilder s = new StringBuilder();
		for (Student student : list) {
			s.append(student.toString());
			s.append("<br>");
		}
		return s.toString();
	}
}
