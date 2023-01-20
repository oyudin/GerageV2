package com.example.geragev2.repository.dao;

import com.example.geragev2.model.Car;


import java.util.List;

public interface CarRepository {

    List<Car> findAllCars();

    Car saveCar(Car car);

    Car updateCar(Car car, int id);

    Car deleteCar(int id);
}
