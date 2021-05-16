package co.com.prueba.usecase.person;

import co.com.prueba.model.person.Person;
import co.com.prueba.model.person.gateways.PersonRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PersonUseCase {

    private final PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }
}
