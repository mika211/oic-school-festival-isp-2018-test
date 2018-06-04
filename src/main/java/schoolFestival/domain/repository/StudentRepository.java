package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
