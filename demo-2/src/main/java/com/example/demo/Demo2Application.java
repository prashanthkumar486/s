package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
//		Employee employee=new Employee();
//		employee.setFirstn("prashu");
//		employee.setLastn("madan");
//		employee.setId(111);
		
//		System.out.println("Id: "+employee.getId());
//		System.out.println("Fname: "+employee.getFirstn());
//		System.out.println("Lname: "+employee.getLastn());
		//System.out.println(employee);
		
		EmployeeAcess e=new EmployeeAcess();
		e.create();
		e.get();
		
		
		}

}
