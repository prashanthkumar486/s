package com.jsp.vehicledb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.vehicledb.model.Vehicle;
import com.jsp.vehicledb.service.VehicleServ;

@RestController

public class VehicleController {
	@Autowired
	VehicleServ serv;
    @PostMapping("vehicledbm")
	public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle){
		return new ResponseEntity<Vehicle>(serv.addVehicle(vehicle),HttpStatus.CREATED);
	}
    @DeleteMapping("deletebyvid/{vid}")
    public ResponseEntity<String> deleteVehicle(@PathVariable("vid")  long vid){
    	serv.deleteVehicleById(vid);
    	return new ResponseEntity<String>("deleted Suceesfully",HttpStatus.OK);
    }
    @GetMapping("getVehicleByid/{vid}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable("vid") long vid){
    	return new ResponseEntity<Vehicle>(serv.getVehicleById( vid),HttpStatus.OK);
    }
    
    @GetMapping("getallvehicle")
    public List<Vehicle> getAllVehicle(){
    	return serv.getAllVehicle();
    }
    @PutMapping("updateById/{vid}")
    public ResponseEntity<Vehicle> updateById(@RequestBody Vehicle vehicle,@PathVariable("vid") long vid){
    	return new ResponseEntity<Vehicle>(serv.updateVehicleById(vehicle, vid),HttpStatus.OK);
    }
    @GetMapping("getByVcolor/{vcolor}")
    public ResponseEntity<Vehicle> getByVcolor(@PathVariable("vcolor")  String vcolor){
    	return new ResponseEntity<Vehicle>(serv.getVehicleByVcolor(vcolor),HttpStatus.OK);
    }
    @GetMapping("getByVpeice/{vprice}")
    public List<Vehicle> getVehicleByVprice(@PathVariable("vprice")  int vprice){
    	return serv.getVehicleByVprice(vprice);
    }
    
    @GetMapping("sortByVprice")
    public List<Vehicle> getVehicleByprice(){
    	return serv.sortVehicleByVprice();
    }
    
   
    
   
}
