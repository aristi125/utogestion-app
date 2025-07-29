package co.org.michael.autogestion.infraestructure.adapter.persistence.plan;

import co.org.michael.autogestion.aplication.port.out.PlanRepository;
import co.org.michael.autogestion.domain.model.Plan;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PlanRepositoryImplement implements PlanRepository {
    private final PlanJpaRepository planRepository;

    public PlanRepositoryImplement(PlanJpaRepository planRepository) {
        this.planRepository = planRepository;
    }

    @Override
    public List<Plan> findAll() {
        return planRepository.findAll().stream().map(p -> new Plan(p.getId(), p.getNombre(), p.getPrecio(), p.getDatosGb(), p.getMinutos(), p.getSms(), p.getDescripcion())).collect(Collectors.toList());
    }

    @Override
    public Plan findById(Long id) {
        return planRepository.findById(id).map(p -> new Plan(p.getId(), p.getNombre(), p.getPrecio(), p.getDatosGb(), p.getMinutos(), p.getSms(), p.getDescripcion())).orElse(null);
    }
}
