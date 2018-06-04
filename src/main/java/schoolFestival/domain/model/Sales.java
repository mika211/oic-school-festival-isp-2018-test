package schoolFestival.domain.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

/**
 * 売上 Entity
 */
@Data
@Entity
@Table(name="t_sales")
public class Sales implements Serializable {

	/** 売上ID */
	@Id
	@SequenceGenerator(name = "t_sales_id_gen", sequenceName = "t_sales_id_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "t_sales_id_gen")
	private Integer id;

	/** 売上日時 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date datetime;

	/** 値引きID */
	private Integer discountId;

	/** 売上明細 一覧 */
	@OneToMany(mappedBy="sales")
	private Set<SalesDetail> salesDetailSet;
	
}
