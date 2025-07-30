package co.org.michael.autogestion.infraestructure.adapter.rest;

import co.org.michael.autogestion.aplication.port.in.ConsumoUseCase;
import co.org.michael.autogestion.domain.model.ConsumoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/consumos")
public class ConsumoController {
    private final ConsumoUseCase consumoUseCase;

    public ConsumoController(ConsumoUseCase consumoUseCase) {
        this.consumoUseCase = consumoUseCase;
    }

    @GetMapping("/{consumoId}")
    public ResponseEntity<ConsumoDTO> obtenerConsumo(@PathVariable Long consumoId) {
        ConsumoDTO consumo = consumoUseCase.obtenerConsumo(consumoId);
        if (consumo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(consumo);
    }
}
