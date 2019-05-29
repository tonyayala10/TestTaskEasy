/**
 * 
 */
package sv.com.prontobpo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.prontobpo.entity.Schedule;
import sv.com.prontobpo.repository.ScheduleRepo;

/**
 * @author tony
 *
 */

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {

	
	@Autowired
	private ScheduleRepo scheduleRepo;

	@Override
	public List<Schedule> findAll() {
		return (List<Schedule>) scheduleRepo.findAll();
	}
	
	@Override
	public List<Schedule> findAllActivos() {
		return (List<Schedule>) scheduleRepo.findAllActivo("1");
	}
	
	
	public Schedule scheduleById(Long id){
		
		Schedule schedule = scheduleRepo.findOne(id);
		
		return schedule;
	}
	
	public Schedule update(Schedule obj) {
		return scheduleRepo.save(obj);
	}
	
	public Schedule create(Schedule obj) {
		// TODO Auto-generated method stub
		return scheduleRepo.save(obj);
	}
	
	public void delete(Schedule emp) {
		scheduleRepo.delete(emp);
	}

	
}
