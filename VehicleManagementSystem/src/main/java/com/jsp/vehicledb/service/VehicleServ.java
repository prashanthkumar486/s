package com.jsp.vehicledb.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.jsp.vehicledb.model.Vehicle;

public interface VehicleServ {
	Vehicle addVehicle(Vehicle vehicle);
	void deleteVehicleById(long vid);
	Vehicle getVehicleById(long vid);
	List<Vehicle> getAllVehicle();
	Vehicle updateVehicleById(Vehicle vehicle,long vid);
	Vehicle getVehicleByVcolor(String vcolor);
	List<Vehicle> getVehicleByVprice(int vprice);
	List<Vehicle> sortVehicleByVprice();
	

}
