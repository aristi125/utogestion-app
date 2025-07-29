package co.org.michael.autogestion.aplication.port.out;

import co.org.michael.autogestion.domain.model.Consumo;


public interface ConsumoRepository {
    Consumo findById(Long id);
}
