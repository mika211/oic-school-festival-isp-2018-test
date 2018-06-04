package schoolFestival.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import schoolFestival.domain.model.Student;
import schoolFestival.domain.service.TestService;

@RestController
@RequestMapping(value="/")
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping
	public String findAllStudent() {
//		List<Student> list = testService.findAllStudent();
//		StringBuilder text = new StringBuilder();
//		for (Student student : list) {
//			text.append(student.toString());
//			text.append("<br>");
//		}
//		return text.toString();
		return "test";
	}
}
