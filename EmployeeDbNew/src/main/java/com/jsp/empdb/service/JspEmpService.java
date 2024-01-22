package com.jsp.empdb.service;

import java.util.List;

import com.jsp.empdb.model.JspEmp;

public interface JspEmpService {
	JspEmp saveJspEmp(JspEmp emp);
	JspEmp getById(long empid);
	List<JspEmp> getAllEmp();
	JspEmp updateById(JspEmp jspEmp,long empid);
}
