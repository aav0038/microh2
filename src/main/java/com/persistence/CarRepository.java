package com.persistence;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{
	
	public List<Car> getAll();
	public Car getById(Long id);
	
}
