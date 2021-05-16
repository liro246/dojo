package co.com.prueba.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<PersonData/* change for adapter model */, String>, QueryByExampleExecutor<PersonData/* change for adapter model */> {
}
