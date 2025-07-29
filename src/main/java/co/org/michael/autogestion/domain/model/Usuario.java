package co.org.michael.autogestion.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private Long id;
    private String nombre;
    private String email;
    private String numCuenta;
    private String numIdentificacion;
    private String numTelefono;
    private LocalDateTime creadoEn;

}
