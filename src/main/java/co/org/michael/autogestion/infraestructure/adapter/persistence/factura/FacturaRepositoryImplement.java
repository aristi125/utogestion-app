package co.org.michael.autogestion.infraestructure.adapter.persistence.factura;

import co.org.michael.autogestion.aplication.port.out.FacturaRepository;
import co.org.michael.autogestion.domain.model.Factura;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FacturaRepositoryImplement implements FacturaRepository {
    private final FacturaJpaRepository jpaRepository;

    public FacturaRepositoryImplement(FacturaJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<Factura> findAll() {
        return jpaRepository.findAll().stream()
                .map(f -> new Factura(
                        f.getId(),
                        f.getPeriodo(),
                        f.getMonto(),
                        f.getFechaVencimiento(),
                        f.getFechaCreacion(),
                        f.getPlan() != null ? f.getPlan().getNombre() : null,
                        f.getUsuario() != null ? f.getUsuario().getNombre() : null
                ))
                .collect(Collectors.toList());
    }

    @Override
    public Factura findById(Long id) {
        return jpaRepository.findById(id)
                .map(f -> new Factura(
                        f.getId(),
                        f.getPeriodo(),
                        f.getMonto(),
                        f.getFechaVencimiento(),
                        f.getFechaCreacion(),
                        f.getPlan() != null ? f.getPlan().getNombre() : null,
                        f.getUsuario() != null ? f.getUsuario().getNombre() : null
                ))
                .orElse(null);
    }

    @Override
    public List<Factura> findByRageDate(LocalDate fechaInicio, LocalDate fechaFin) {
        return jpaRepository.findByFechaCreacionBetween(fechaInicio,fechaFin).stream()
                .map(f -> new Factura(
                        f.getId(),
                        f.getPeriodo(),
                        f.getMonto(),
                        f.getFechaVencimiento(),
                        f.getFechaCreacion(),
                        f.getPlan() != null ? f.getPlan().getNombre(): null,
                        f.getUsuario() != null ? f.getUsuario().getNombre() : null
                ))
                .collect(Collectors.toList());
    }

}
