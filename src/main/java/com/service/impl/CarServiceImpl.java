package com.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.CarRepository;
import com.persistence.entities.Car;
import com.service.CarService;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	@Override
	public List<Car> getAll() {
		return carRepository.getAll(); 
	}

	@Override
	public Car getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car create(Long id, String model, Date fechaFabricacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car update(Long id, String model, Date fechaFabricacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveCar(Car car) {
		// TODO Auto-generated method stub
		return false;
	}

}
