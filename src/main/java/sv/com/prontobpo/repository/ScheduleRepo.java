/**
 * 
 */
package sv.com.prontobpo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sv.com.prontobpo.entity.Schedule;

/**
 * @author tony
 *
 */

@Repository
public interface ScheduleRepo extends JpaRepository<Schedule, Long>{
	
	List<Schedule> findAll();
	
	@Query("SELECT s FROM Schedule s from s.scheduleActive =:scheduleActive")
	List<Schedule> findAllActivo(@Param("scheduleActive") String scheduleActive);

}
