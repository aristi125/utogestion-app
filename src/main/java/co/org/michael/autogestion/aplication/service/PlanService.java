package co.org.michael.autogestion.aplication.service;

import co.org.michael.autogestion.aplication.port.in.PlanUseCase;
import co.org.michael.autogestion.aplication.port.out.PlanRepository;
import co.org.michael.autogestion.domain.model.PlanDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService implements PlanUseCase {

    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    @Override
    public List<PlanDTO> obtenerPlanes() {
        return planRepository.findAll();
    }

    @Override
    public PlanDTO obtenerPlan(Long id) {
        return planRepository.findById(id);
    }
}
