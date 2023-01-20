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


    public Person getPersonById(int personId) throws PersonNotFound {
        Person person = personRepository.getPersonById(personId);
        if (person == null) throw new PersonNotFound(personId);
        return person;
    }


    public Person addPerson(Person person) {
        return personRepository.savePerson(person);
    }


    public Person updatePerson(Person person, int personId) throws PersonNotFound {
        personRepository.updatePerson(person, personId);
        if (person == null) throw new PersonNotFound(personId);
        return person;
    }


    public Person deletePerson(int id) {
        return personRepository.deletePerson(id);
    }


    public void addCarToPerson(int personId, int carId) {
        personRepository.addCarToPerson(personId, carId);
    }
}
