package net.javaguides.springboot.rep;

import org.springframework.data.repository.CrudRepository;

import net.javaguides.springboot.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
