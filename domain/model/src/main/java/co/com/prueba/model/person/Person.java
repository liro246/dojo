package co.com.prueba.model.person;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Person {
    private Long id;
    private String tipoDocumento;
    private String  numeroDocumento;
}
