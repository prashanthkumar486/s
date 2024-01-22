package com.jsp.empdb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private String rName;
	private String fname;
	private Object fValue;
	public ResourceNotFoundException(String rName, String fname, Object fValue) {
		super();
		this.rName = rName;
		this.fname = fname;
		this.fValue = fValue;
	}
	public String getrName() {
		return rName;
	}
	public String getFname() {
		return fname;
	}
	public Object getfValue() {
		return fValue;
	}
	

}
