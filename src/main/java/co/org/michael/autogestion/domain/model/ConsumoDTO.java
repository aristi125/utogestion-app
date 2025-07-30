package co.org.michael.autogestion.domain.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumoDTO {
    private Long id;

    @NotNull(message = "Los datos consumidos no pueden ser nulos")
    @Min(value = 0, message = "Los datos consumidos no pueden ser negativos")
    private Integer datosGb;

    @NotNull(message = "Los minutos consumidos no pueden ser nulos")
    @Min(value = 0, message = "Los minutos consumidos no pueden ser negativos")
    private Integer minutos;

    @NotNull(message = "Los SMS consumidos no pueden ser nulos")
    @Min(value = 0, message = "Los SMS consumidos no pueden ser negativos")
    private Integer sms;

    @NotNull(message = "La fecha de última actualización es obligatoria")
    private LocalDateTime ultimaActualizacion;
}
