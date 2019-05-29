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
@Table(name = "employees")
public class Employees implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1819938529292437857L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long employeeId;
	
	@Column(name = "first_name_employee")
	private String firstNameEmployee;
	
	@Column(name = "second_name_employee")
	private String secondNameEmployee;
	
	@Column(name = "last_name_employee")
	private String lastNameEmployee;
	
	@Column(name = "active_employee")
	private String activeEmployee;
	
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstNameEmployee() {
		return firstNameEmployee;
	}
	public void setFirstNameEmployee(String firstNameEmployee) {
		this.firstNameEmployee = firstNameEmployee;
	}
	public String getSecondNameEmployee() {
		return secondNameEmployee;
	}
	public void setSecondNameEmployee(String secondNameEmployee) {
		this.secondNameEmployee = secondNameEmployee;
	}
	public String getLastNameEmployee() {
		return lastNameEmployee;
	}
	public void setLastNameEmployee(String lastNameEmployee) {
		this.lastNameEmployee = lastNameEmployee;
	}
	public String getActiveEmployee() {
		return activeEmployee;
	}
	public void setActiveEmployee(String activeEmployee) {
		this.activeEmployee = activeEmployee;
	}
	
	public String getNombreCompleto() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.firstNameEmployee).append(", ").append(this.secondNameEmployee).append("").append(this.lastNameEmployee);		
		return sb.toString();			
	}
}
