package co.org.michael.autogestion.infraestructure.adapter.persistence.factura;

import co.org.michael.autogestion.infraestructure.adapter.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface FacturaJpaRepository extends JpaRepository<FacturaEntity, Long> {
    List<FacturaEntity> findByFechaCreacionBetween(LocalDate fechaInicio, LocalDate fechaFin);

}
