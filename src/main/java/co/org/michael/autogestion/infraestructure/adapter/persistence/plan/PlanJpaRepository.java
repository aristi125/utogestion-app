package co.org.michael.autogestion.infraestructure.adapter.persistence.plan;

import co.org.michael.autogestion.infraestructure.adapter.entity.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlanJpaRepository extends JpaRepository<PlanEntity, Long> {
}
