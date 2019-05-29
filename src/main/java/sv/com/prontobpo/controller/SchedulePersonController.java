/**
 * 
 */
package sv.com.prontobpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.prontobpo.dto.ConsultaHorario;
import sv.com.prontobpo.entity.Employees;
import sv.com.prontobpo.entity.ScheduleMeetingEmployees;
import sv.com.prontobpo.services.SchedulePersonService;


/**
 * @author tony
 *
 */

@RestController
@RequestMapping("/schedulePerson")
public class SchedulePersonController extends AbstractBaseController{
	
	@Autowired
	SchedulePersonService schedulePersonService;
	
	
	@GetMapping("/")
	public ResponseEntity<?> allSchedulePersona(){
		
		List<ScheduleMeetingEmployees> listAllSchedulePerson = schedulePersonService.findAll();
		
		return generateSingleHashMapResponse(listAllSchedulePerson, "Datos Extraidos Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
	@PostMapping(value = "/disponibilidadHorario")
	public ResponseEntity<?> getDisponibilidadHorario(@RequestBody ConsultaHorario consultaHorario){
		
		List<Employees> list = schedulePersonService.schedulePersonByHorario(consultaHorario);
		
		return generateSingleHashMapResponse(list, "Datos Extraidos Correctamente", HttpStatus.OK, Integer.valueOf(HttpStatus.OK.value()));
	}
	
}
