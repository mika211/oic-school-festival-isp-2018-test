package schoolFestival.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import schoolFestival.domain.model.TestModel;
import schoolFestival.domain.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("/")
	public String test() {
		List<TestModel> list = testService.findAll();
		StringBuilder s = new StringBuilder();
		for (TestModel value : list) {
			s.append(value.toString());
			s.append("<br>");
		}
		return s.toString();
	}
	
	@RequestMapping("/create")
	public String create(@RequestParam("name") String name, @RequestParam("price") String price) {
		TestModel testModel = new TestModel(name, price);
		try {
			testService.insert(testModel);
		}catch(Exception e){
			return e.getMessage();
		}
		return "OK";
	}
	
}
