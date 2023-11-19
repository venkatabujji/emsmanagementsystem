package com.example1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(length = 10)
	    private int emp_id;

	    @Column(length = 50)
	    private String emp_name;

	    @Column(unique = true)
	    private String emp_email;

	    @Column(unique = true)
	    private String emp_phone_no;

	    @Column(length = 20)
	    private String gender;

	    @Column(length = 15)
	    private String salary;

	    // Change: Removed @JsonIgnore from here
	    @JsonIgnore
	    @ManyToOne
	    @JoinColumn(name = "dept_id")
	    private Department department;

}
