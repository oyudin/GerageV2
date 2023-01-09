package com.example.geragev2.controller;

import com.example.geragev2.exception.CarNotFound;
import com.example.geragev2.model.Car;
import com.example.geragev2.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/garage/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getAllCars(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "Cars";
    }

    @PutMapping
    public @ResponseBody void saveCar(@RequestBody Car car) {
        this.carService.addCar(car);
    }

    @PostMapping("/{carId}")
    public @ResponseBody void updateCar(@PathVariable int carId, @RequestBody Car car) throws CarNotFound {
        this.carService.updateCar(car, carId);
    }

    @DeleteMapping("/{carId}")
    public @ResponseBody void deleteCar(@PathVariable int carId) {
        this.carService.deleteCar(carId);
    }
}
