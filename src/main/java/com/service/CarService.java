package com.service;

import java.util.Date;
import java.util.List;

import com.persistence.entities.Car;

public interface CarService {
	
	public List<Car> getAll();
	public Car getById(Long id);
	public Car create(Long id, String model, Date fechaFabricacion);
	public Car update(Long id, String model, Date fechaFabricacion);
	public boolean saveCar(Car car);
	
	
}
