/**
 * 
 */
package sv.com.prontobpo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.prontobpo.entity.Employees;
import sv.com.prontobpo.repository.EmployeeRepo;

/**
 * @author tony
 *
 */

@Service
@Transactional
public class EmployeesServiceImpl implements EmployeesService {

	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employees> findAll() {
		return (List<Employees>) employeeRepo.findAll();
	}
	
	@Override
	public List<Employees> findAllActivos() {
		return (List<Employees>) employeeRepo.findAllByActiveEmployee("1");
	}
	
	public Employees employeeById(Long id){
		
		Employees employees = employeeRepo.findOne(id);
		
		return employees;
	}
	
	public Employees update(Employees obj) {
		return employeeRepo.save(obj);
	}
	
	public Employees create(Employees obj) {
		// TODO Auto-generated method stub
		return employeeRepo.save(obj);
	}
	
	public void delete(Employees emp) {
		employeeRepo.delete(emp);
	}

	
}
