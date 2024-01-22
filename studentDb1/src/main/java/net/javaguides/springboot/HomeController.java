package net.javaguides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.entity.Student;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String home() {
		return "web.jsp";
	}
	
}
