package com.example.geragev2.repository.dao;

import com.example.geragev2.model.Person;
import com.example.geragev2.model.Garage;

import java.util.List;

public interface PersonRepository {

    List<Garage> getPersonsWithCars();

    Person getPersonById(int personId);

    List<Person> getAllPersons();

    void savePerson(Person person);

    void deletePerson(int id);

    void updatePerson(Person person, int id);

    void addCarToPerson(int carId, int personId);
}
