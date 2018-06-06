package schoolFestival.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;
import lombok.ToString;

/**
 * 当番 Entity
 */
@Data
@Entity
@Table(name="t_shift")
public class Shift implements Serializable {

	/** 当番ID */
	@Id
	@SequenceGenerator(name = "t_shift_id_gen", sequenceName = "t_shift_id_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "t_shift_id_gen")
	private Integer id;
	
	/** 学生 */
	@Fetch(FetchMode.JOIN)
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	/** 開始日時 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDatetime;

	/** 終了日時 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDatetime;

}
