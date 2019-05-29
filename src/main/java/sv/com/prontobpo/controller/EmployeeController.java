/**
 * 
 */
package sv.com.prontobpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.prontobpo.entity.Employees;
import sv.com.prontobpo.services.EmployeesService;

/**
 * @author tony
 *
 */

@ControllerAdvice
@RestController
@RequestMapping("/employees")
public class EmployeeController extends AbstractBaseController{
	
	@Autowired
	EmployeesService employeesService;
	
	@GetMapping("/")
	public ResponseEntity<?> allEmployee(){
		
		List<Employees> listAllEmp = employeesService.findAll();
		
		return generateSingleHashMapResponse(listAllEmp, "Datos Extraidos Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@GetMapping("/activos")
	public ResponseEntity<?> allEmployeeActive
	(){
		
		List<Employees> listAllEmp = employeesService.findAllActivos();
		
		return generateSingleHashMapResponse(listAllEmp, "Datos Extraidos Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> employeeById(@PathVariable("id") Long id){
		
		Employees employees = employeesService.employeeById(id);
		
		if(employees != null)
			return generateSingleHashMapResponse(employees, "Dato Extraido Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
		else
			return generateSingleHashMapResponse("", "Id "+ id + " no encontrado", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@PutMapping(value = "/")
	public ResponseEntity<?> updateEmployee(@RequestBody Employees employees){
		
		employeesService.update(employees);
		return generateSingleHashMapResponse("", "Datos Actualizados Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<?> createEmployee(@RequestBody Employees employees){
		employeesService.create(employees);
		return generateSingleHashMapResponse("", "Datos Registrado Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@DeleteMapping(value = "/{Id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("Id") Long Id ){
		Employees employees = employeesService.employeeById(Id);
		employeesService.delete(employees);
		return generateSingleHashMapResponse("", "Dato Eliminado Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	
	
	

}
