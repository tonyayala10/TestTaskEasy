/**
 * 
 */
package sv.com.prontobpo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sv.com.prontobpo.entity.Employees;

/**
 * @author tony
 *
 */

@Repository
public interface EmployeeRepo extends JpaRepository<Employees, Long>{
	
	List<Employees> findAll();
	
	@Query("SELECT e FROM Employees e where e.activeEmployee =:activeEmployee")
	List<Employees> findAllByActiveEmployee(@Param("activeEmployee") String activeEmployee);
	
	@Query("SELECT e FROM Employees e where e.employeeId not in(?1) and e.activeEmployee ='1'")
	List<Employees> findAllByListSchedulePerson(List<Long> listEmployeeId);
	

}
