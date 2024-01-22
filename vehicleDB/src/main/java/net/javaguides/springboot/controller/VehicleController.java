package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import net.javaguides.springboot.entity.Vehicle;
import net.javaguides.springboot.repo.VehicleRepo;

@Controller
public class VehicleController {
	@Autowired
	VehicleRepo repo;
	
	@RequestMapping("madan")
	public String helo() {
		return "web.jsp";
	}
	
	@RequestMapping("addVehicle")
	public String addVehicle(Vehicle v, HttpSession h) {
		repo.save(v);
		return "web.jsp";
	}
	
	@RequestMapping("getByid")
	public String getbyId(int vid) {
		Vehicle v= repo.findById(vid).orElse(null);
		System.out.println(v);
		return "web.jsp";
	}
	
	@RequestMapping("getBycolor")
	public String getbyVcolor(String  color) {
		System.out.println(repo.findByColor(color));
		return "web.jsp";
	}
	
	@RequestMapping("getByvmode")
	public String getByVmode(String vmode) {
		System.out.println(repo.findByVmode(vmode));
		return "web.jsp";
	}

	@RequestMapping("getByvyear")
	public String getByVmode(int vyear) {
		System.out.println(repo.findByVyear(vyear));
		
		System.out.println("========================");
		System.out.println(repo.findByYearSorted());
		return "web.jsp";
	}
	
	@RequestMapping("deleteByid")
	public String deletebyId(int vid) {
		repo.deleteById(vid);
		return "web.jsp";
	}
	
	@RequestMapping("deletebyvmode")
	public String deleyeByVmode(String vmode) {
		repo.deleteByVmode(vmode);
		return "web.jsp";
	}
	
	

	

}
