package net.javaguides.springboot.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import net.javaguides.springboot.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;


	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}


	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee= employeeRepository.findById( id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}
//		else {
//
//			throw new ResourceNotFoundException("Employee", "Id", id);
//
//		}
		return employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
	}


	@Override
	public Employee updateEmployee(Employee employee, long id) {
		//we need to check whether the id is present or not
		Employee employee2=employeeRepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Employee", "Id", id));
		employee2.setFname(employee.getFname());
		employee2.setLname(employee.getLname());
		employee2.setEmail(employee.getEmail());
		
		//Save Employee to Db
		employeeRepository.save(employee2);
		return null;
	}


	@Override
	public void deleteEmployee(long id) {
		//check whether the employee exit in Db  or not
		employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);
		
	}


}
