package com.controller;

import com.persistence.entities.Car;
import com.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller 
public class CarController {

	@Autowired
	private CarService carService;
	
	
	public boolean saveCar(Car c) {
		return carService.saveCar(c);
	}
}
