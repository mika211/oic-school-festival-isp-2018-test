package schoolFestival.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import schoolFestival.domain.model.StudentEntity;
import schoolFestival.domain.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<StudentEntity> getStudents() {
		return testService.findAllStudent();
	}
	
}
