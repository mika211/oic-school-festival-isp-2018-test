package schoolFestival.domain.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TestModel {

	@Id
	private Integer hours;
	
	private Integer amount;

	public TestModel(int hours, int amount) {
		super();
		this.hours = hours;
		this.amount = amount;
	}
	
}
