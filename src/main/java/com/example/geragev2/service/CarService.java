package com.example.geragev2.service;

import com.example.geragev2.exception.CarNotFound;
import com.example.geragev2.model.Car;
import com.example.geragev2.repository.dao.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        return carRepository.findAllCars();
    }

    public Car addCar(Car car) {
        carRepository.saveCar(car);
        return car;
    }

    public Car updateCar(Car car, int carId) throws CarNotFound {
        carRepository.updateCar(car, carId);
        if (car == null) throw new CarNotFound(carId);
        return car;
    }

    public void deleteCar(int id) {
        carRepository.deleteCar(id);
    }
}
