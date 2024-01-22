package net.javaguides.springboot.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.javaguides.springboot.entity.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle, Integer> {
	List<Vehicle> findByVname(String vname);

}
