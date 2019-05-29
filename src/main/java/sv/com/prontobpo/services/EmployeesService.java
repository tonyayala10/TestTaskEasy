/**
 * 
 */
package sv.com.prontobpo.services;

import java.util.List;

import sv.com.prontobpo.entity.Employees;


/**
 * @author tony
 *
 */
public interface EmployeesService {//extends CRUD<Employees>{
	
	List<Employees> findAll();
	
	Employees employeeById(Long id);
	
	Employees update(Employees obj);
	
	Employees create(Employees obj);
	
	void delete(Employees emp);
	
	List<Employees> findAllActivos();
	

}
