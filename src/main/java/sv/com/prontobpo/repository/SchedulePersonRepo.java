/**
 * 
 */
package sv.com.prontobpo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sv.com.prontobpo.entity.ScheduleMeetingEmployees;

/**
 * @author tony
 *
 */

@Repository
public interface SchedulePersonRepo extends JpaRepository<ScheduleMeetingEmployees, Long>{
	
	List<ScheduleMeetingEmployees> findAll();
	
	//@Query("SELECT sme from ScheduleMeetingEmployees sme where sme.shcedule.scheduleDescription =:scheduleDescription and sme.smempIdDate =:smempIdDate")
	@Query("SELECT sme from ScheduleMeetingEmployees sme where sme.schedule.scheduleDescription =:scheduleDescription")
	List<ScheduleMeetingEmployees> schedulePersonByTime(@Param("scheduleDescription")String scheduleDescription/*, @Param("smempIdDate") String smempIdDate*/);

}
