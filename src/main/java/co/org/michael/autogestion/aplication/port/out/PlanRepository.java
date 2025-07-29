package co.org.michael.autogestion.aplication.port.out;

import co.org.michael.autogestion.domain.model.Plan;

import java.util.List;

public interface PlanRepository {
    List<Plan> findAll();
    Plan findById(Long id);
}
