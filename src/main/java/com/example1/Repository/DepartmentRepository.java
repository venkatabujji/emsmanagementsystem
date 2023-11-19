package com.example1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example1.Model.Department;






@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

}
