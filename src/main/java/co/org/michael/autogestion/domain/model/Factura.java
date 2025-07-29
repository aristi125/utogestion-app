package co.org.michael.autogestion.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    private Long id;
    private String periodo;
    private Double monto;
    private LocalDate fechaVencimiento;
    private LocalDate fechaCreacion;
    private String nomPlan;
    private String nomUsuario;

}
