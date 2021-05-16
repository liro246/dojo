package co.com.prueba.jpa;

import co.com.prueba.jpa.helper.AdapterOperations;
import co.com.prueba.model.person.Person;
import co.com.prueba.model.person.gateways.PersonRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<Person/* change for domain model */, PersonData/* change for adapter model */, String, JPARepository>
 implements PersonRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.mapBuilder(d, Person.PersonBuilder.class/* change for domain model */).build());
    }
}
