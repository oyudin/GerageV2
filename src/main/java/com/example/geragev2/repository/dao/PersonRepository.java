package com.example.geragev2.repository.dao;

import com.example.geragev2.model.Person;
import com.example.geragev2.model.Garage;

import java.util.List;

public interface PersonRepository {

    List<Garage> getPersonsWithCars();

    Person getPersonById(int personId);

    List<Person> getAllPersons();

    Person savePerson(Person person);

    Person deletePerson(int id);

    Person updatePerson(Person person, int id);

    void addCarToPerson(int carId, int personId);
}
