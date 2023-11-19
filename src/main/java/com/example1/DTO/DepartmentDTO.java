package com.example1.DTO;

import java.util.List;

import com.example1.Model.Employee;

import lombok.Data;


@Data
public class DepartmentDTO 
{
	private String dept_id;
	private String dept_name;
	private boolean status=Boolean.TRUE;
	List<Employee> employees;
}


