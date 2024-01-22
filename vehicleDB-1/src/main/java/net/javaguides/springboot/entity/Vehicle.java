package net.javaguides.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Vehicle {
	@Id
	private int vid;
	private String vname;
	private String colour;
	private int rate;
	

}
