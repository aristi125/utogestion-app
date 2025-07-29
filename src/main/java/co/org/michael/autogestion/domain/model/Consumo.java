package co.org.michael.autogestion.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumo {
    private Long id;
    private Integer datosGb;
    private Integer minutos;
    private Integer sms;
    private LocalDateTime ultimaActualizacion;
}
