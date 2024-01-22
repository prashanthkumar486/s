package com.jsp.empdb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.empdb.exception.ResourceNotFoundException;
import com.jsp.empdb.model.JspEmp;
import com.jsp.empdb.repo.JspEmpRepoJpa;
import com.jsp.empdb.service.JspEmpService;

@Service
public class JspEmpServiceImpl implements JspEmpService {
	@Autowired
	JspEmpRepoJpa repo;
	@Override
	public JspEmp saveJspEmp(JspEmp emp) {
		return 	repo.save(emp);
	}
	@Override
	public JspEmp getById(long empid) {
		
		return repo.findById(empid).orElseThrow(()->new ResourceNotFoundException("Employee", "empid", empid));
	}
	@Override
	public List<JspEmp> getAllEmp() {
	
		return repo.findAll();
	}
	@Override
	public JspEmp updateById(JspEmp jspEmp, long empid) {
		
		JspEmp jspEmp2=  repo.findById(empid).orElseThrow(()->new ResourceNotFoundException("JspEmp", "empid", empid));
		jspEmp2.setEmail(jspEmp.getEmail());
		jspEmp2.setEname(jspEmp.getEname());
		
		return repo.save(jspEmp2);
	}

}
