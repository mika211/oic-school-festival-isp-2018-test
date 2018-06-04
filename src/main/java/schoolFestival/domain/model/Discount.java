package schoolFestival.domain.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * 値引き Entity
 */
@Data
@Entity
@Table(name="t_discount")
public class Discount implements Serializable {

	/** 値引きID */
	@Id
	@SequenceGenerator(name = "t_discount_id_gen", sequenceName = "t_discount_id_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "t_discount_id_gen")
	private Integer id;

	/** 値引き額 */
	private Integer discount;

	/** 値引き対象商品 一覧 */
	@ManyToMany(mappedBy="discountSet")
	private Set<Product> productSet;

}
