package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import net.javaguides.springboot.entity.Employee;
import net.javaguides.springboot.rep.EmployeeRepo;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepo repp;
	@RequestMapping("home")
	public String home() {
		return "web.jsp";
	}
	@RequestMapping("adddata")
	public String adddata(Employee e,HttpSession h) {
		repp.save(e);
		return "web.jsp";
	}

}
