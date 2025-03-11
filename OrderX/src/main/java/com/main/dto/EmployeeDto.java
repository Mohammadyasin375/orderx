/**
 * 
 */
package com.main.dto;

/**
 * This class is DTO (Data Transfer Object) used to restructure our object.
 */
public class EmployeeDto {
	
	private long employeeId;
	private String fistName;
	private String lastName;
	private String jobTitle;
	
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	@Override
	public String toString() {
		return "EmployeeDto [employeeId=" + employeeId + ", fistName=" + fistName + ", lastName=" + lastName
				+ ", jobTitle=" + jobTitle + "]";
	}
	
}
