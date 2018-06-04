package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
