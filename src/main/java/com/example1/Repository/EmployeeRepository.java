package com.example1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example1.Model.Employee;




@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

}
