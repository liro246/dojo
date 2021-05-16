package co.com.prueba.api;
import co.com.prueba.model.person.Person;
import co.com.prueba.usecase.person.PersonUseCase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final PersonUseCase useCase;


    @GetMapping(path = "/saveperson")
    public Person savePerson(@RequestBody PersonDTO personDTO) {
        return useCase.savePerson(Person.builder()
                .tipoDocumento(personDTO.tipoIdentificacion)
                .numeroDocumento(personDTO.numeroIdentificacion)
                .build());
    }

    @GetMapping(path = "/findall")
    public List<Person> findAll() {
        return useCase.findAll();
    }

    @Data
    @NoArgsConstructor
    private static class PersonDTO{
        @NonNull
        private String tipoIdentificacion;
        @NonNull
        private String numeroIdentificacion;
    }
}
