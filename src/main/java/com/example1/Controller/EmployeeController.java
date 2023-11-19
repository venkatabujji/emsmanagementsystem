package com.example1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example1.DTO.EmployeeDTO;
import com.example1.Model.Department;
import com.example1.Model.Employee;
import com.example1.Service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeservice;

	@GetMapping("/Employees")
	public List<Employee> getEmployees() {
		return employeeservice.getEmployees();
	}

	@GetMapping("/Employee/{emp_id}")
	public Employee getEmployeeById(@PathVariable("emp_id") int emp_id) {
		return employeeservice.getEmployeeById(emp_id);

	}

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeservice.addEmployee(employee);
	}

	@PutMapping("/updateEmployee/{emp_id}")
	public Employee updateEmployee(@PathVariable("emp_id") int id, @RequestBody Employee employee) {
		return employeeservice.updateEmployee(id, employee);
	}

	@DeleteMapping("/deleteEmployee/{emp_id}")

	public Employee deleteEmployee(@PathVariable("emp_id") int id, Employee employee) 
	{
		return employeeservice.deleteEmployee(id, employee);
	}
	
	
	@PostMapping("/department/employee")
	public Employee addDepartmentToEmployee(@RequestParam int dept_id, @RequestParam int emp_id)
	{
		return employeeservice.addEmployeeToDepartment(dept_id, emp_id);
	}
}
