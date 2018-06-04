package schoolFestival.domain.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * 学生 Entity
 */
@Data
@Entity
@Table(name="t_student")
public class Student implements Serializable {

	/** 出席番号 */
	@Id
	private Integer studentId;

	/** 名前 */
	private String name;

	/** 当番 一覧 */
//	@OneToMany(mappedBy="student")
	private Set<Shift> shiftSet;

}
