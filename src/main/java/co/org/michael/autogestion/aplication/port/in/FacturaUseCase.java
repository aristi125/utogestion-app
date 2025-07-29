package co.org.michael.autogestion.aplication.port.in;

import co.org.michael.autogestion.domain.model.Factura;

import java.time.LocalDate;
import java.util.List;

public interface FacturaUseCase {
    List<Factura> obtenerFacturas();

    Factura obtenerFactura(Long id);

    List<Factura> obtenerFacturasPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin);
}
