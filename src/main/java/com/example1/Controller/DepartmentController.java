package com.example1.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.Model.Department;
import com.example1.Service.DepartmentService;
import com.example1.Util.Converter;





@CrossOrigin(origins ="http://localhost:4200")
@RestController

public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentservice;
	
	@Autowired
	private Converter converter;
	
	@GetMapping("/Departments")
	public List<Department> getDepartments()
	{
		return departmentservice.getAllDepartments();
	}
	
	@GetMapping("/Department/{dept_id}")
	public Department getDepartmentById(@PathVariable("dept_id") int dept_id)
	{
		return departmentservice.getDepartmentById(dept_id);
	}
	
	@PostMapping("/addDepartment")
	public Department addDepartment(@RequestBody Department department)
	{
		return departmentservice.addDepartment(department);
	}
	
	
	@PutMapping("/updateDepartment/{dept_id}")
	public Department updateDepartment(@PathVariable("dept_id") int dept_id, @RequestBody Department department)
	{
		return departmentservice.updateDepartment(dept_id, department);
	}
	
	@DeleteMapping("/deleteDepartment/{dept_id}")
	public Department deleteDepartment(@PathVariable("dept_id") int dept_id)
	{
		return departmentservice.deleteDepartment(dept_id);
	}


}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	