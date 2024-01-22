package com.jsp.vehicledb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.vehicledb.model.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle , Long>{
	@Query(value = "select * from vehicle where vcolor=?",nativeQuery = true)
	public Vehicle getVehicleByVcolor(String vcolor);
	
	@Query(value = "select * from vehicle where vprice>?",nativeQuery = true)
	public List<Vehicle> getVehicleByVprice(int vprice);
	
	@Query(value = "select * from vehicle order by vprice",nativeQuery = true)
	public List<Vehicle> sortVehicleByVprice();
	
	
	
	

}
