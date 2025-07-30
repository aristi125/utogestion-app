package co.org.michael.autogestion.aplication.port.in;

import co.org.michael.autogestion.domain.model.ConsumoDTO;


public interface ConsumoUseCase {
    ConsumoDTO obtenerConsumo(Long id);
}
