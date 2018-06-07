package schoolFestival.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import schoolFestival.domain.model.Sales;
import schoolFestival.domain.model.SalesDetail;
import schoolFestival.domain.model.TestModel;

public interface TestModelRepository extends JpaRepository<TestModel, Integer> {

	@Query("select new TestModel(date_trunc('hour', w.datetime), SUM(w.amount)) from (select s(s.id, s.datetime, s.discount, (sum(p.price * sd.qty) - s.discount)) from Sales s join SalesDetail sd on s = sd.sales join ProductPrice p on sd.productPrice = p group by s.id, s.datetime, s.discount) as w group by 1 order by 1")
	List<TestModel> findAll();
	
}
