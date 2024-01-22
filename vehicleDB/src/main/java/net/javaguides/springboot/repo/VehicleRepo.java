package net.javaguides.springboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import net.javaguides.springboot.entity.Vehicle;

public interface VehicleRepo extends CrudRepository<Vehicle, Integer> {

	List<Vehicle> findByColor(String color);
	List<Vehicle> findByVmode(String vmode);
	List<Vehicle> findByVyear(int vyear);
	
	//deleting by vmode
	@Query(value = "delete * from vehicle where vmode=?",nativeQuery = true)
	List<Vehicle> deleteByVmode(String vmode);
	
	//sorting
	
	@Query(value="select * from vehicle order by vyear desc", nativeQuery = true)
	List<Vehicle> findByYearSorted();
}
