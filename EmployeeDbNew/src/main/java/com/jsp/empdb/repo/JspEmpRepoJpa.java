package com.jsp.empdb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.empdb.model.JspEmp;

public interface JspEmpRepoJpa  extends JpaRepository<JspEmp, Long>{

}
