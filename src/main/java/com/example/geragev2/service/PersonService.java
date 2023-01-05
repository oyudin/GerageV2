package com.example.geragev2.service;

import com.example.geragev2.exception.PersonNotFound;
import com.example.geragev2.model.Person;
import com.example.geragev2.model.Garage;
import com.example.geragev2.repository.dao.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Garage> getAllPersonsAndCars() {
        return personRepository.getPersonsWithCars();
    }


    public List<Person> getAllPersons() {
        return personRepository.getAllPersons();
    }


    public void getPersonById(int personId) throws PersonNotFound {
        Person person = personRepository.getPersonById(personId);
        if (person == null) throw new PersonNotFound(personId);
    }


    public void addPerson(Person person) {
        personRepository.savePerson(person);
    }


    public void updatePerson(Person person, int personId) throws PersonNotFound {
        personRepository.updatePerson(person, personId);
        if (person == null) throw new PersonNotFound(personId);
    }


    public void deletePerson(int id) {
        personRepository.deletePerson(id);
    }



    public void addCarToPerson(int personId, int carId) {
        personRepository.addCarToPerson(personId, carId);
    }
}
