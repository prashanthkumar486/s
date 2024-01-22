package com.example.demo;

import org.springframework.stereotype.Controller;

@Controller
public class EmployeeAcess {
	Employee employee=new Employee();
	
	public void create(){
		employee.setFirstn("prashu");
		employee.setLastn("madan");
		employee.setId(111);
		
	}
	public void get() {
		System.out.println(employee);
	}

}
