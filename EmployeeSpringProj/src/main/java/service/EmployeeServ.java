package service;

import java.util.List;

import net.javaguides.springboot.entity.Employee;

public interface EmployeeServ {

	
	public Employee create(Employee employee);
	
	public Employee getEmployee(long id);
	
	public List<Employee> getAllEmployee();
	
	public String delete(Long id);
	
	public Employee update(Employee employee);
}
