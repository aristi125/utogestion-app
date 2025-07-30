package co.org.michael.autogestion.infraestructure.adapter.persistence.consumo;

import co.org.michael.autogestion.aplication.port.out.ConsumoRepository;
import co.org.michael.autogestion.domain.model.ConsumoDTO;
import org.springframework.stereotype.Repository;

@Repository
public class ConsumoRepositoryImplements implements ConsumoRepository {
    private final ConsumoJpaRepository jpaRepository;

    public ConsumoRepositoryImplements(ConsumoJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public ConsumoDTO findById(Long id) {
        return jpaRepository.findByPlanId(id).map(c -> new ConsumoDTO(
                c.getId(),c.getDatosGb(),c.getMinutos(),c.getSms(),c.getUltimaActualizacion())).orElse(null);
    }
}
