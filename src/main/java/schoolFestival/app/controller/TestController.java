package schoolFestival.app.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import schoolFestival.domain.model.TestModel;
import schoolFestival.domain.service.TestService;

@RestController
@RequestMapping("/")
public class TestController {

	@Autowired
	TestService testService;

	@RequestMapping
	public String test() {
		List<TestModel> list = testService.findAll();
		StringBuilder s = new StringBuilder();
		for (TestModel value : list) {
			s.append(value.toString());
			s.append("<br>");
		}
		return s.toString();
	}

	@RequestMapping(params="discount")
	public String create(
			@RequestParam("discount") String discount,
			@RequestParam("productId") String productId,
			@RequestParam("price") String price,
			@RequestParam("qty") String qty) {
		TestModel testModel = new TestModel(
				Integer.parseInt(discount),
				Integer.parseInt(productId),
				Integer.parseInt(price),
				Integer.parseInt(qty));
		try {
			testService.insert(testModel);
		}catch(Exception e){
			return e.getMessage();
		}
		return "OK";
	}

}
