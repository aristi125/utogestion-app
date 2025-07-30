package co.org.michael.autogestion.aplication.port.in;

import co.org.michael.autogestion.domain.model.PlanDTO;

import java.util.List;

public interface PlanUseCase {
    List<PlanDTO>  obtenerPlanes();
    PlanDTO obtenerPlan(Long id);

}
