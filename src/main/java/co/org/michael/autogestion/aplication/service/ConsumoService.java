package co.org.michael.autogestion.aplication.service;

import co.org.michael.autogestion.aplication.port.in.ConsumoUseCase;
import co.org.michael.autogestion.aplication.port.out.ConsumoRepository;
import co.org.michael.autogestion.domain.model.ConsumoDTO;
import org.springframework.stereotype.Service;

@Service
public class ConsumoService implements ConsumoUseCase {

    private final ConsumoRepository consumoRepository;

    public ConsumoService(ConsumoRepository consumoRepository) {
        this.consumoRepository = consumoRepository;
    }

    @Override
    public ConsumoDTO obtenerConsumo(Long id) {
        return consumoRepository.findById(id);
    }
}
