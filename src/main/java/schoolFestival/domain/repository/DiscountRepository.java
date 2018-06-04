package schoolFestival.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import schoolFestival.domain.model.DiscountEntity;

public interface DiscountRepository extends JpaRepository<DiscountEntity, Integer> {

}
