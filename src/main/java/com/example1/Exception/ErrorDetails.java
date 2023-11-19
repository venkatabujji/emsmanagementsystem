package com.example1.Exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails 
{
	private Date timeStamp;
	private String mesage;
	private String details;
}
