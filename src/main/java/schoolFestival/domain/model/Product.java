package schoolFestival.domain.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * 商品 Entity
 */
@Data
@Entity
@Table(name="t_product")
public class Product {

	/** 商品ID */
	@Id
	@SequenceGenerator(name = "t_product_id_gen", sequenceName = "t_product_id_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "t_product_id_gen")
	private Integer productId;

	/** 商品名 */
	private String productName;

	/** 値引き対象商品 一覧 */
	@ManyToMany
	private Set<Discount> discountSet;

	/** 商品価格 一覧 */
	@OneToMany(mappedBy="product")
	private Set<ProductPrice> productPriceSet;

}
