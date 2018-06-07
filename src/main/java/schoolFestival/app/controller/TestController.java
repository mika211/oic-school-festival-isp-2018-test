package schoolFestival.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import schoolFestival.domain.model.ProductPrice;
import schoolFestival.domain.model.Shift;
import schoolFestival.domain.model.Student;
import schoolFestival.domain.service.TestService;

@RestController
@RequestMapping("/")
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping
	public String test() {
		List<ProductPrice> list = testService.findAll();
		StringBuilder s = new StringBuilder();
		for (ProductPrice value : list) {
			s.append(value.toString());
			s.append("<br>");
		}
		return s.toString();
	}
}
