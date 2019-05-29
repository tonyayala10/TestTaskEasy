/**
 * 
 */
package sv.com.prontobpo.services;

import java.util.List;

import sv.com.prontobpo.dto.ConsultaHorario;
import sv.com.prontobpo.entity.Employees;
import sv.com.prontobpo.entity.ScheduleMeetingEmployees;


/**
 * @author tony
 *
 */
public interface SchedulePersonService {
	
	List<ScheduleMeetingEmployees> findAll();
	
	List<Employees> schedulePersonByHorario(ConsultaHorario consultaHorario);
	
	/*Schedule scheduleById(Long id);
	
	Schedule update(Schedule obj);
	
	Schedule create(Schedule obj);
	
	void delete(Schedule emp);*/
	

}
