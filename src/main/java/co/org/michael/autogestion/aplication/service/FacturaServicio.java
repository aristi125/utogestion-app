package co.org.michael.autogestion.aplication.service;

import co.org.michael.autogestion.aplication.port.in.FacturaUseCase;
import co.org.michael.autogestion.aplication.port.out.FacturaRepository;
import co.org.michael.autogestion.domain.model.Factura;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FacturaServicio implements FacturaUseCase {

    private final FacturaRepository facturaRepository;

    public FacturaServicio(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    @Override
    public List<Factura> obtenerFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura obtenerFactura(Long id) {
        return facturaRepository.findById(id);
    }

    @Override
    public List<Factura> obtenerFacturasPorRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        return facturaRepository.findByRageDate(fechaInicio, fechaFin);
    }
}
