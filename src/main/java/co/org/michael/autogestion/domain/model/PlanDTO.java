package co.org.michael.autogestion.domain.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanDTO {

    private Long id;

    @NotBlank(message = "El nombre del plan no puede estar vacío")
    private String nombre;

    @NotNull(message = "El precio es obligatorio")
    @Positive(message = "El precio debe ser mayor a cero")
    private Double precio;

    @NotNull(message = "Los datos GB son obligatorios")
    @Min(value = 0, message = "Los datos GB no pueden ser negativos")
    private Integer datosGb;

    @NotNull(message = "Los minutos son obligatorios")
    @Min(value = 0, message = "Los minutos no pueden ser negativos")
    private Integer minutos;

    @NotNull(message = "Los SMS son obligatorios")
    @Min(value = 0, message = "Los SMS no pueden ser negativos")
    private Integer sms;

    private String descripcion;
}
