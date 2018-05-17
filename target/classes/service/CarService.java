package service;

import java.util.List;

import po.Car;


public interface CarService {
	public Car getCar(String carId);
	
	public List<Car> getAllCar(Car car);
	
}
