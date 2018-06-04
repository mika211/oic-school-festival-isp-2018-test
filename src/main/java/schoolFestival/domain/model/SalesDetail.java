package schoolFestival.domain.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * 売上明細 Entity
 */
@Data
@ToString(exclude="sales")
@Entity
@Table(name="t_sales_detail")
public class SalesDetail implements Serializable {

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
