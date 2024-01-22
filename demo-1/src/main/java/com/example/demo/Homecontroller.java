package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Homecontroller {
	@Autowired
	StudentRepo repo;
	
	
	@RequestMapping("display")
	//@ResponseBody
//	 public String display(HttpServletRequest req) {
//		HttpSession s=req.getSession();
//		String name=req.getParameter("name");
//		s.setAttribute("name", name);
//		System.out.println("Name: "+name);
//	 return "webbb.jsp";
//	}
	
	
 public String display() {
	
 return "webbb.jsp";
 }
	
	@RequestMapping("addstudent")
	public String addstudent(Student ss,HttpSession s) {
		repo.save(ss);
		s.setAttribute("name", ss.getSname());
		System.out.println("Name: "+ss);
		return "webbb.jsp";
	}
	
	
//	public ModelAndView display(String name) {
//		ModelAndView mv=new ModelAndView();
//		mv.addObject("name", name);
//		mv.setViewName("webbb.jsp");
//		return mv;
// }
	
//	public ModelAndView display(Student s) {
//		ModelAndView mv=new ModelAndView();
//	mv.addObject("name", s);
//	mv.setViewName("webbb.jsp");
//	return mv;
// }
}
