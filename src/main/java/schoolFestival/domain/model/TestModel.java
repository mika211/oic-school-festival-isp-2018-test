package schoolFestival.domain.model;

import lombok.ToString;

@ToString
public class TestModel {
	
	private int id;

	private String name;
	
	private int price;

	public TestModel(String name, String price) {
		this.name = name;
		this.price = Integer.parseInt(price);
	}
	
}
