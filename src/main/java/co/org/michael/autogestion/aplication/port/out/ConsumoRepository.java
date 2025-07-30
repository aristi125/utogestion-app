package co.org.michael.autogestion.aplication.port.out;

import co.org.michael.autogestion.domain.model.ConsumoDTO;


public interface ConsumoRepository {
    ConsumoDTO findById(Long id);
}
