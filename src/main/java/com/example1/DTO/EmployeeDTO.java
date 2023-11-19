package com.example1.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;





public class EmployeeDTO 
{
	
	private String emp_name;
	
	private String emp_email;
	
	private String gender;
	
	private String salary;
	
	private int dept_id;
	
	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getEmp_phone_no() {
		return emp_phone_no;
	}

	public void setEmp_phone_no(String emp_phone_no) {
		this.emp_phone_no = emp_phone_no;
	}

	private String emp_phone_no;
	 
}


