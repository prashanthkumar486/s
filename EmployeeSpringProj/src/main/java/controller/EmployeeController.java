package controller;

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

import net.javaguides.springboot.entity.Employee;
import service.EmployeeServ;
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeServ serv;
	 @PostMapping("create")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(serv.create(employee),HttpStatus.CREATED);
	 }
		@GetMapping("getmapping")
		public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
			return new ResponseEntity<Employee>(serv.getEmployee(id),HttpStatus.OK);
	}
		@GetMapping("/get/{id}")
         public <List>Employee getAllEmployee(){
        	return (Employee) serv.getAllEmployee();
         }
		@DeleteMapping("deleted")
		public ResponseEntity<String> delete(@PathVariable Long id){
			return new ResponseEntity<String>(serv.delete(id),HttpStatus.OK);
		 }  
		 @PutMapping("/updated")
			public ResponseEntity<Employee> update(@RequestBody Employee employee){
				return new ResponseEntity<Employee>(serv.update(employee),HttpStatus.CREATED);
			 }
		
}