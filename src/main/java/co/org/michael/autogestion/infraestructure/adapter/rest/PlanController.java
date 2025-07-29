package co.org.michael.autogestion.infraestructure.adapter.rest;

import co.org.michael.autogestion.aplication.port.in.PlanUseCase;
import co.org.michael.autogestion.domain.model.Plan;
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
    public ResponseEntity<List<Plan>> obtenerPlanes() {
        return ResponseEntity.ok(planUseCase.obtenerPlanes());
    }

    @GetMapping("/{planId}")
    public ResponseEntity<Plan> obtenerPlan(@PathVariable Long planId) {
        Plan plan = planUseCase.obtenerPlan(planId);
        if (plan == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(plan);
    }
}
