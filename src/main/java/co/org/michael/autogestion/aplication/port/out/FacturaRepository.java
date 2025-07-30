package co.org.michael.autogestion.aplication.port.out;

import co.org.michael.autogestion.domain.model.FacturaDTO;

import java.time.LocalDate;
import java.util.List;


public interface FacturaRepository {
    List<FacturaDTO> findAll();

    FacturaDTO findById(Long id);

    List<FacturaDTO> findByRageDate(LocalDate fechaInicio, LocalDate fechaFin);
}
