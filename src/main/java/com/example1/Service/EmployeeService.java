package com.example1.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example1.DTO.EmployeeDTO;
import com.example1.Model.Department;
import com.example1.Model.Employee;




public interface EmployeeService 
{
	
	List<Employee> getEmployees();
	Employee getEmployeeById(int id);
	Employee updateEmployee(int id,Employee employee);
	Employee deleteEmployee(int id, Employee employee);
	Employee addEmployee( Employee employee);
	//String assignDepartmentToEmployee(int did, int eid);
	Department getEmployeeDepartment(int emp_id);
	Employee addEmployeeToDepartment(int id, int emp_id);
}
