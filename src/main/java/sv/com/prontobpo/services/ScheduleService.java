/**
 * 
 */
package sv.com.prontobpo.services;

import java.util.List;

import sv.com.prontobpo.entity.Schedule;


/**
 * @author tony
 *
 */
public interface ScheduleService {
	
	List<Schedule> findAll();
	
	Schedule scheduleById(Long id);
	
	Schedule update(Schedule obj);
	
	Schedule create(Schedule obj);
	
	void delete(Schedule emp);
	
	List<Schedule> findAllActivos();
	

}
