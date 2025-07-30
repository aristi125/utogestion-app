package co.org.michael.autogestion.infraestructure.adapter.rest;

import co.org.michael.autogestion.aplication.port.in.PlanUseCase;
import co.org.michael.autogestion.domain.model.PlanDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/planes")
public class PlanController {
    private final PlanUseCase planUseCase;

    public PlanController(PlanUseCase planUseCase) {
        this.planUseCase = planUseCase;
    }

    @GetMapping("/")
    public ResponseEntity<List<PlanDTO>> obtenerPlanes() {
        return ResponseEntity.ok(planUseCase.obtenerPlanes());
    }

    @GetMapping("/{planId}")
    public ResponseEntity<PlanDTO> obtenerPlan(@PathVariable Long planId) {
        PlanDTO plan = planUseCase.obtenerPlan(planId);
        if (plan == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(plan);
    }
}
