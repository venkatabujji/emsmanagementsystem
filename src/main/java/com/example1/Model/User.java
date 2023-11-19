package com.example1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Registration")
@Inheritance(strategy=InheritanceType.JOINED)
public class User 
{
	@Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   private int userId;
	   
	   @NotNull
	   @Column(length=30)
	   private String userName;
	   
	   @NotNull
	   @Column(length=30)
	   private String password;

	public User orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	   
	  

}
