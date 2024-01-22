package com.jsp.empdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.empdb.exception.ResourceNotFoundException;
import com.jsp.empdb.model.JspEmp;
import com.jsp.empdb.service.JspEmpService;

@RestController
@RequestMapping("AddJspEmp")
public class JspEmpController {
	@Autowired
	JspEmpService empService;
	
	
	public JspEmpController(JspEmpService empService) {
		super();
		this.empService = empService;
	}

	@PostMapping
	public ResponseEntity<JspEmp> saveJspEmp(@RequestBody JspEmp emp){
		
		return new ResponseEntity<JspEmp>(empService.saveJspEmp(emp),HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<JspEmp> getById(@PathVariable("id") long empidd){
		
		return new ResponseEntity<JspEmp>(empService.getById(empidd),HttpStatus.OK);
	}
	
	@GetMapping
	public List<JspEmp> getAllEmp(){
		return empService.getAllEmp();
	}
	
	@PutMapping("{id}")
	public ResponseEntity<JspEmp> updateById( @RequestBody JspEmp jspEmp, @PathVariable("id")long empidd){
		return new ResponseEntity<JspEmp>(empService.updateById(jspEmp, empidd),HttpStatus.OK);
	}
	

}
