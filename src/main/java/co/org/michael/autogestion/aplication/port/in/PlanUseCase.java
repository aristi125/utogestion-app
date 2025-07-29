package co.org.michael.autogestion.aplication.port.in;

import co.org.michael.autogestion.domain.model.Plan;

import java.util.List;

public interface PlanUseCase {
    List<Plan>  obtenerPlanes();
    Plan obtenerPlan(Long id);

}
