/**
 * 
 */
package sv.com.prontobpo.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.prontobpo.dto.ConsultaHorario;
import sv.com.prontobpo.entity.Employees;
import sv.com.prontobpo.entity.ScheduleMeetingEmployees;
import sv.com.prontobpo.repository.EmployeeRepo;
import sv.com.prontobpo.repository.SchedulePersonRepo;
import sv.com.prontobpo.utils.Utils;

/**
 * @author tony
 *
 */

@Service
@Transactional
public class SchedulePersonServiceImpl implements SchedulePersonService {

	
	@Autowired
	private SchedulePersonRepo schedulePersonRepo;
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public List<ScheduleMeetingEmployees> findAll() {
		return (List<ScheduleMeetingEmployees>) schedulePersonRepo.findAll();
	}	
	
	
	public List<Employees> schedulePersonByHorario(ConsultaHorario consultaHorario){
		List<ScheduleMeetingEmployees> list = schedulePersonRepo.schedulePersonByTime(consultaHorario.getHora()/*, consultaHorario.getFecha()*/);
		List<Employees> listEmployeesActive = null;
		List<Long> listEmployeeId = new ArrayList<Long>();
		
		if(Utils.isEmptyList(list))
			return listEmployeesActive = employeeRepo.findAllByActiveEmployee("1");
		else{
			list.stream().forEach((x)->{
				listEmployeeId.add(x.getEmployee().getEmployeeId());
			});
			
			return listEmployeesActive = employeeRepo.findAllByListSchedulePerson(listEmployeeId);
		}
			
	}

}
