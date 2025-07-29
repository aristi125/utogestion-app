package co.org.michael.autogestion.infraestructure.adapter.persistence.consumo;

import co.org.michael.autogestion.infraestructure.adapter.entity.ConsumoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ConsumoJpaRepository extends JpaRepository<ConsumoEntity, Long> {
    Optional<ConsumoEntity> findByPlanId(Long planId);
}
