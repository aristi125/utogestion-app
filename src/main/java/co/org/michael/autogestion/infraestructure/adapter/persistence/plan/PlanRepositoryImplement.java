package co.org.michael.autogestion.infraestructure.adapter.persistence.plan;

import co.org.michael.autogestion.aplication.port.out.PlanRepository;
import co.org.michael.autogestion.domain.model.PlanDTO;
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
    public List<PlanDTO> findAll() {
        return planRepository.findAll().stream().map(p -> new PlanDTO(p.getId(), p.getNombre(), p.getPrecio(), p.getDatosGb(), p.getMinutos(), p.getSms(), p.getDescripcion())).collect(Collectors.toList());
    }

    @Override
    public PlanDTO findById(Long id) {
        return planRepository.findById(id).map(p -> new PlanDTO(p.getId(), p.getNombre(), p.getPrecio(), p.getDatosGb(), p.getMinutos(), p.getSms(), p.getDescripcion())).orElse(null);
    }
}
