/**
 * 
 */
package sv.com.prontobpo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author tony
 *
 */

@Entity
@Table(name = "ScheduleMeetingEmployees")
@JsonInclude(Include.NON_NULL)
public class ScheduleMeetingEmployees implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3174127546958657235L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "smemp_id")
	private Long smemp;
	
	@ManyToOne
	@JoinColumn(name = "employee_id_employee_id")
	private Employees employee;
	
	@ManyToOne
	@JoinColumn(name = "shcedule_id_schedule_id")
	private Schedule schedule;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "smemp_id_date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", timezone = "America/ES")
	private Date smempIdDate;
	
	@Column(name = "smemp_id_description")
	private String smempIdDescription;

	public Long getSmemp() {
		return smemp;
	}

	public void setSmemp(Long smemp) {
		this.smemp = smemp;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Date getSmempIdDate() {
		return smempIdDate;
	}

	public void setSmempIdDate(Date smempIdDate) {
		this.smempIdDate = smempIdDate;
	}

	public String getSmempIdDescription() {
		return smempIdDescription;
	}

	public void setSmempIdDescription(String smempIdDescription) {
		this.smempIdDescription = smempIdDescription;
	}
}
