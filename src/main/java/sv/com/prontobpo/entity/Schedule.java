/**
 * 
 */
package sv.com.prontobpo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author tony
 *
 */

@Entity
@Table(name = "Schedule")
public class Schedule implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -506398387099428L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "schedule_id")
	private Long scheduleId;
	
	@Column(name = "schedule_time")
	private String scheduleTime;
	
	@Column(name = "schedule_description")
	private String scheduleDescription;
	
	@Column(name = "schedule_active")
	private String scheduleActive;
	
	
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public String getScheduleDescription() {
		return scheduleDescription;
	}
	public void setScheduleDescription(String scheduleDescription) {
		this.scheduleDescription = scheduleDescription;
	}
	public String getScheduleActive() {
		return scheduleActive;
	}
	public void setScheduleActive(String scheduleActive) {
		this.scheduleActive = scheduleActive;
	}
	
	
	

}
