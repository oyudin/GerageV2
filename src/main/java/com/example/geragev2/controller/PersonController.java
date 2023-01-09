package com.example.geragev2.controller;

import com.example.geragev2.exception.PersonNotFound;
import com.example.geragev2.model.Person;
import com.example.geragev2.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/garage")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String getAllPersonsAndCars(Model model) {
        model.addAttribute("personsWithCars", personService.getAllPersonsAndCars());
        return "Garage";
    }

    @GetMapping("/persons")
    public String getAllPersons(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "Persons";
    }

    @GetMapping("persons/{personId}")
    public @ResponseBody void getPersonById(@PathVariable int personId) throws PersonNotFound {
        this.personService.getPersonById(personId);
    }

    @PutMapping("persons")
    public @ResponseBody void savePerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @DeleteMapping("persons/{personId}")
    public @ResponseBody void deletePerson(@PathVariable int personId) {
        this.personService.deletePerson(personId);
    }


    @PostMapping("persons/{personId}")
    public @ResponseBody void updatePerson(@PathVariable int personId, @RequestBody Person person) throws PersonNotFound {
        this.personService.updatePerson(person, personId);
    }

    @PatchMapping("persons/{personId}/addCar/{carId}")
    public @ResponseBody void addCarToPerson(@PathVariable int personId, @PathVariable int carId) {
        this.personService.addCarToPerson(personId, carId);
    }
}
