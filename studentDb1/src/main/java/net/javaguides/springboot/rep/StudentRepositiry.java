package net.javaguides.springboot.rep;

import org.springframework.data.repository.CrudRepository;

import net.javaguides.springboot.entity.Student;

public interface StudentRepositiry extends CrudRepository<Student, String > {


}
