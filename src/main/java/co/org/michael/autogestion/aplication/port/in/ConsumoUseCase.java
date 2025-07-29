package co.org.michael.autogestion.aplication.port.in;

import co.org.michael.autogestion.domain.model.Consumo;


public interface ConsumoUseCase {
    Consumo obtenerConsumo(Long id);
}
