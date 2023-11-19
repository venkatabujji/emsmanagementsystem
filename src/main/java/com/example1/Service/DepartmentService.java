package com.example1.Service;

import java.util.List;

import com.example1.Model.Department;




public interface DepartmentService 
{

	List<Department> getAllDepartments();
   
	Department getDepartmentById(int id);
	Department updateDepartment(int id, Department department1);
	Department deleteDepartment(int id);
	//Department registerDepartment(Department department1);
	//String assignEmployeeToDepartment(int did, int eid);

	Department addDepartment(Department department1);


}
