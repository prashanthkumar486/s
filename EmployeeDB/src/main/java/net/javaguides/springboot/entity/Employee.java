package net.javaguides.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	private int eid;
	private String ename;
	private int age;
	private String adress;

}
