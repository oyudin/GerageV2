package com.example.geragev2.repository.dao;

import com.example.geragev2.model.Car;


import java.util.List;

public interface CarRepository {

    List<Car> findAllCars();

    void saveCar(Car car);

    void updateCar(Car car, int id);

    void deleteCar(int id);
}
