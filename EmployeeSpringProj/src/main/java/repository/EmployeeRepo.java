package repository;

import org.springframework.data.jpa.repository.JpaRepository;


import net.javaguides.springboot.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
