package schoolFestival.domain.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * 売上明細 Entity
 */
@Data
@Entity
@Table(name="t_sales_detail")
public class SalesDetail {

	/** 売上 */
	@EmbeddedId
	@ManyToOne
	private Sales sales;

	/** 商品価格 */
	@EmbeddedId
	@ManyToOne
	private ProductPrice productPrice;

	/** 個数 */
	private Integer qty;

}
