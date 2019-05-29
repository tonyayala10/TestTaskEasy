/**
 * 
 */
package sv.com.prontobpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.prontobpo.entity.Schedule;
import sv.com.prontobpo.services.ScheduleService;

/**
 * @author tony
 *
 */

@RestController
@RequestMapping("/schedule")
public class ScheduleController extends AbstractBaseController{
	
	@Autowired
	ScheduleService scheduleService;
	
	@GetMapping("/")
	public ResponseEntity<?> allSchedule(){
		
		List<Schedule> listAllEmp = scheduleService.findAll();
		
		return generateSingleHashMapResponse(listAllEmp, "Datos Extraidos Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@GetMapping("/activos")
	public ResponseEntity<?> allScheduleActivos(){
		
		List<Schedule> listAllEmp = scheduleService.findAllActivos();
		
		return generateSingleHashMapResponse(listAllEmp, "Datos Extraidos Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> scheduleById(@PathVariable("id") Long id){
		
		Schedule schedule = scheduleService.scheduleById(id);
		
		if(schedule != null)
			return generateSingleHashMapResponse(schedule, "Dato Extraido Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
		else
			return generateSingleHashMapResponse("", "Id "+ id + " no encontrado", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@PutMapping(value = "/")
	public ResponseEntity<?> updateEmployee(@RequestBody Schedule schedule){
		
		scheduleService.update(schedule);
		return generateSingleHashMapResponse("", "Datos Actualizados Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@PostMapping(value = "/")
	public ResponseEntity<?> createEmployee(@RequestBody Schedule schedule){
		scheduleService.create(schedule);
		return generateSingleHashMapResponse("", "Datos Registrado Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@DeleteMapping(value = "/{Id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable("Id") Long Id ){
		Schedule schedule = scheduleService.scheduleById(Id);
		scheduleService.delete(schedule);
		return generateSingleHashMapResponse("", "Dato Eliminado Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	

}
