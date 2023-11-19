package com.example1.ServiceImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example1.DTO.EmployeeDTO;
import com.example1.Exception.ResourceNotFoundException;
import com.example1.Model.Department;
import com.example1.Model.Employee;
import com.example1.Repository.DepartmentRepository;
import com.example1.Repository.EmployeeRepository;
import com.example1.Service.EmployeeService;
import com.example1.Util.Converter;





@Service
public class EmployeeServiceImple implements EmployeeService 
{

	@Autowired
    private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private Converter converter;
	
	
	@Override
	public List<Employee> getEmployees()
	{
		List<Employee> employeeList=employeeRepository.findAll();
		ArrayList<Employee> employees=new  ArrayList<>(employeeList);
		return employees;
	}
	
	
	
	public Employee addEmployee(Employee employee)
	{
	   
	        employeeRepository.save(employee);
	        return employee;
	}


	
	

	



	@Override
	public Employee updateEmployee(int emp_id, Employee employee)
	{
		try
		{
		Employee newEmployee=employeeRepository.findById(emp_id).get();
		if(employee.getEmp_name()!=null)
		{
			newEmployee.setEmp_name(employee.getEmp_name());
		}
		if(employee.getEmp_email()!=null)
		{
			newEmployee.setEmp_email(employee.getEmp_email());
		}
		if(employee.getEmp_phone_no()!=null)
		{
			newEmployee.setEmp_phone_no(employee.getEmp_phone_no());
		}
		if(employee.getGender()!=null)
		{
			newEmployee.setGender(employee.getGender());
		}
		if(employee.getSalary()!=null)
		{
			newEmployee.setSalary(employee.getSalary());
		}
		employeeRepository.save(newEmployee);
		return newEmployee;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
		}
	
	@Override
	public Employee deleteEmployee(int emp_id, Employee employee) 
	{
		try
		{
		employee=employeeRepository.findById(emp_id).get();
		employeeRepository.delete(employee);
		return employee;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}


	public String assignDepartmentToEmployee(int did, int eid) {
		Employee e=employeeRepository.findById(eid).orElseThrow(()->
		new ResourceNotFoundException("Employee", "Id", eid));
		
		Department d=departmentRepository.findById(did).orElseThrow(()->
		new ResourceNotFoundException("Department", "Id", did));
		
		List<Employee> employees=new ArrayList<>();
		employees.add(e);
		
	
		
		
		employeeRepository.save(e);
		return "Employees assigned to Department successfully";
	}



	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		try
		{
			Employee employee=employeeRepository.findById(id).get();
		return employee;
		}
		catch(Exception e)
		{
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}



	@Override
	public Department getEmployeeDepartment(int emp_id)
	{
		Employee employee=employeeRepository.findById(emp_id).get();
		return employee.getDepartment();
	}

	
	@Override
	public Employee addEmployeeToDepartment(int id, int emp_id) 
	{
			Department department=departmentRepository.findById(id)
					.orElseThrow(()-> new EntityNotFoundException("department not found with id: "+ id));

		
	       Employee employee= employeeRepository.findById(emp_id)
	                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + emp_id));

	        department.getEmployees().add(employee);
	      employee.setDepartment(department);
	        employeeRepository.save(employee);
	        departmentRepository.save(department);
	        return employee;
	    }
}
	
	