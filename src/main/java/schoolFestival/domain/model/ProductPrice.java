package schoolFestival.domain.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.ToString;

/**
 * 商品価格 Entity
 */
@Data
@Entity
@Table(name="t_product_price")
public class ProductPrice implements Serializable {

	/** 商品価格ID */
	@Id
	@SequenceGenerator(name = "t_product_price_id_gen", sequenceName = "t_product_price_id_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "t_product_price_id_gen")
	private Integer id;

	/** 商品 */
	@ManyToOne
	private Product product;

	/** 価格 */
	private Integer price;

	/** 適用開始日時 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDatetime;

	/** 適用終了日時 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDatetime;

}
