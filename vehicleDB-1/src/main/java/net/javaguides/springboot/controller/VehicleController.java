package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.entity.Vehicle;
import net.javaguides.springboot.repo.VehicleRepo;

@Controller
public class VehicleController {
	@Autowired
	VehicleRepo repoo;
	@RequestMapping("saved")
	public String hello() {
		return "web.jsp";
	}
	@RequestMapping("adddata")
	public String saveVehicle(Vehicle v) {
		repoo.save(v);
		return "web.jsp";
	}
	
	@RequestMapping("getbyid")
	public String getById(int vid) {
		Vehicle v=repoo.findById(vid).orElse(null);
		System.out.println(v);
		return "web.jsp";
	}
	
	@RequestMapping("getbyvname")
	public String getByVname(String vname) {
		System.out.println(	repoo.findByVname(vname));
		return "web.jsp";
	}
	
	@RequestMapping("deletebyid")
	public String deleteVehicleById(int vid) {
		repoo.deleteById(vid);
		return "web.jsp";
	}

}
