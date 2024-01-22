package net.javaguides.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	@GetMapping("hello")
	public Family hello() {
	
		return 	new Family(1,"manu");
	}

}
