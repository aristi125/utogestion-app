package co.org.michael.autogestion.aplication.service;

import co.org.michael.autogestion.aplication.port.in.ConsumoUseCase;
import co.org.michael.autogestion.aplication.port.out.ConsumoRepository;
import co.org.michael.autogestion.domain.model.Consumo;
import org.springframework.stereotype.Service;

@Service
public class ConsumoService implements ConsumoUseCase {

    private final ConsumoRepository consumoRepository;

    public ConsumoService(ConsumoRepository consumoRepository) {
        this.consumoRepository = consumoRepository;
    }

    @Override
    public Consumo obtenerConsumo(Long id) {
        return consumoRepository.findById(id);
    }
}
