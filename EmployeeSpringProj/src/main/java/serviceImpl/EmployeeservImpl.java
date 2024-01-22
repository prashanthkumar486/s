package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.javaguides.springboot.entity.Employee;
import net.javaguides.springboot.rep.EmployeeRepo;
import service.EmployeeServ;

public class EmployeeservImpl implements EmployeeServ {

	@Autowired
	private EmployeeRepo repo;
	
	@Override
	public Employee create(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	//@Override
	//public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		//return repo.findAllById("<Integer>");
	//}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) repo.findAll();
	}

	@Override
	public String delete(Long id) {
		// TODO Auto-generated method stub
	   return null;
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	@Override
	public Employee getEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
