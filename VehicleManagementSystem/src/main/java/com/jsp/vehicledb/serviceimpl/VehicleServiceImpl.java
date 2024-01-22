package com.jsp.vehicledb.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Service;

import com.jsp.vehicledb.exception.ResourceNotFoundException;
import com.jsp.vehicledb.model.Vehicle;
import com.jsp.vehicledb.repo.VehicleRepo;
import com.jsp.vehicledb.service.VehicleServ;
@Service
public class VehicleServiceImpl implements VehicleServ{
	@Autowired
	 private VehicleRepo repo;
	
	
	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return repo.save(vehicle);
	}
	@Override
	public void deleteVehicleById(long vid) {
		repo.findById(vid).orElseThrow(()->new ResourceNotFoundException("vehicle","vid",vid));
		 repo.deleteById(vid);
	}
	@Override
	public Vehicle getVehicleById( long vid) {
		Vehicle vehicle2=repo.findById(vid).orElseThrow(()->new ResourceNotFoundException("vehicle","vid",vid));
		return vehicle2;
	}
	@Override
	public List<Vehicle> getAllVehicle() {
		
		return repo.findAll();
	}
	@Override
	public Vehicle updateVehicleById(Vehicle vehicle, long vid) {
		 Vehicle vehicle2= repo.findById(vid).orElseThrow(()->new ResourceNotFoundException("vehicle","vid",vid));
		vehicle2.setVcolor(vehicle.getVcolor());
		vehicle2.setVmodel(vehicle.getVmodel());
		vehicle2.setVname(vehicle.getVname());
		 
		 return repo.save(vehicle2);
	}
	@Override
	public Vehicle getVehicleByVcolor(String vcolor) {
		Optional<Vehicle>  vehicle=Optional.ofNullable( repo.getVehicleByVcolor(vcolor));
		if(vehicle.isPresent()) {
		return vehicle.get();
		}
		else {
			 throw new ResourceNotFoundException("vehicle","VCOLOR",vcolor);
		}

	}
	@Override
	public List<Vehicle> getVehicleByVprice(int vprice) {
		
		Optional<List<Vehicle>>  vehicle=Optional.ofNullable( repo.getVehicleByVprice(vprice));
		if(vehicle.isPresent()) {
		return vehicle.get();
		}
		else {
			 throw new ResourceNotFoundException("vehicle","VCOLOR",vprice);
		}

	}
	@Override
	public List<Vehicle> sortVehicleByVprice() {
		
		return repo.sortVehicleByVprice();
	}
	
	
	
	
}
