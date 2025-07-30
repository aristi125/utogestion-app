package co.org.michael.autogestion.aplication.service;

import co.org.michael.autogestion.aplication.port.in.FacturaUseCase;
import co.org.michael.autogestion.aplication.port.out.FacturaRepository;
import co.org.michael.autogestion.domain.model.FacturaDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FacturaServicie implements FacturaUseCase {

    private final FacturaRepository facturaRepository;

    public FacturaServicie(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    @Override
    public List<FacturaDTO> obtenerFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    public FacturaDTO obtenerFactura(Long id) {
        return facturaRepository.findById(id);
    }

    @Override
    public List<FacturaDTO> obtenerFacturasPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        return facturaRepository.findByRageDate(fechaInicio, fechaFin);
    }
}
