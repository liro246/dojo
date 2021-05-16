package co.com.prueba.model.person.gateways;

import co.com.prueba.model.person.Person;

import java.util.List;

public interface PersonRepository {
    List<Person> findAll();
    Person save(Person person);
}
