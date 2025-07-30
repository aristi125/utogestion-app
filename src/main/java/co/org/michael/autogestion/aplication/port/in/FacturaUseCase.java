package co.org.michael.autogestion.aplication.port.in;

import co.org.michael.autogestion.domain.model.FacturaDTO;

import java.time.LocalDate;
import java.util.List;

public interface FacturaUseCase {
    List<FacturaDTO> obtenerFacturas();

    FacturaDTO obtenerFactura(Long id);

    List<FacturaDTO> obtenerFacturasPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin);
}
