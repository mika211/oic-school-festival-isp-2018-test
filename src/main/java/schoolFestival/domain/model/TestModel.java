package schoolFestival.domain.model;

import java.util.Date;

import lombok.Setter;
import lombok.ToString;

@ToString
public class TestModel {
	
	@Setter
	private int id;
	private int detailId;
	
	private Date salesAt;
	private int discount;
	private int productId;
	private int price;
	private int qty;

	public TestModel(int discount, int productId, int price, int qty) {
		super();
		this.discount = discount;
		this.productId = productId;
		this.price = price;
		this.qty = qty;
	}

	public TestModel() {}
	
//	private int id;
//	private Date salesAt;
//	private int discount;
//	private Details details;
//	
//	public TestModel(int id, Date salesAt, int discount, Details details) {
//		super();
//		this.id = id;
//		this.salesAt = salesAt;
//		this.discount = discount;
//		this.details = details;
//	}
//
//	@ToString
//	private class DetailModel {
//		
//		private int id;
//		private int productId;
//		private int qty;
//		
//		public DetailModel(int id, int productId, int qty) {
//			super();
//			this.id = id;
//			this.productId = productId;
//			this.qty = qty;
//		}
//		
//	}
//	
//	@ToString
//	private class Details {
//		
//		private List<DetailModel> details;
//		
//		public Details() {
//			details = new ArrayList<>();
//		}
//		
//	}
	
}