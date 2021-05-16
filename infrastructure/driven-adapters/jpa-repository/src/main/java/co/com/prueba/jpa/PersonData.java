package co.com.prueba.jpa;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "personas")
public class PersonData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "tipo_identificacion")
    private String  tipoDocumento;
    @Column(name = "numero_identificacion")
    private String  numeroDocumento;
}
