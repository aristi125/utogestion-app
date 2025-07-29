package co.org.michael.autogestion.aplication.port.out;

import co.org.michael.autogestion.domain.model.Factura;

import java.time.LocalDate;
import java.util.List;


public interface FacturaRepository {
    List<Factura> findAll();

    Factura findById(Long id);

    List<Factura> findByRageDate(LocalDate fechaInicio, LocalDate fechaFin);
}
