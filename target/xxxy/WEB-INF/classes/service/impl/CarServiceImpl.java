package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CarMapper;
import po.Car;
import po.CarExample;
import service.CarService;

@Service("carServiceImpl")
public class CarServiceImpl implements CarService {

	@Autowired
	private CarMapper mapper;
	
	@Override
	public Car getCar(String carId) {
		return mapper.selectByPrimaryKey(carId);
	}

	@Override
	public List<Car> getAllCar(Car car) {
		CarExample example = new CarExample();
		CarExample.Criteria criteria = example.createCriteria();
		if(car!=null) {
			if(car.getCarId()!=null&&(!car.getCarId().trim().equals(""))) {
				criteria.andCarIdLike("%"+car.getCarId()+"%");
			}
		}

        return mapper.selectByExample(example);
	
	}
 
}
