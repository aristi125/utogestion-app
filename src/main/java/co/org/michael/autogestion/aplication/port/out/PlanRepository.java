package co.org.michael.autogestion.aplication.port.out;

import co.org.michael.autogestion.domain.model.PlanDTO;

import java.util.List;

public interface PlanRepository {
    List<PlanDTO> findAll();
    PlanDTO findById(Long id);
}
