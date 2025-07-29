package co.org.michael.autogestion.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plan {
    private Long id;
    private String nombre;
    private Double precio;
    private Integer datosGb;
    private Integer minutos;
    private Integer sms;
    private String descripcion;
}
