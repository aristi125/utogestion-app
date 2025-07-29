package co.org.michael.autogestion.infraestructure.adapter.rest;

import co.org.michael.autogestion.aplication.port.in.FacturaUseCase;
import co.org.michael.autogestion.domain.model.Factura;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/facturas")
public class FacturaController {

    private final FacturaUseCase facturaUseCase;

    public FacturaController(FacturaUseCase facturaUseCase) {
        this.facturaUseCase = facturaUseCase;
    }

    @GetMapping("/")
    public ResponseEntity<List<Factura>> obtenerFacturas() {
        return ResponseEntity.ok(facturaUseCase.obtenerFacturas());
    }

    @GetMapping("/{facturaId}")
    public ResponseEntity<Factura> obtenerFactura(@PathVariable Long facturaId) {
        Factura factura = facturaUseCase.obtenerFactura(facturaId);
        if (factura == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(factura);
    }

    @GetMapping("/date-range")
    public ResponseEntity<List<Factura>> obtenerFacturaRangoFechas(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaInicio,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaFin) {
        return ResponseEntity.ok(facturaUseCase.obtenerFacturasPorRangoFechas(fechaInicio, fechaFin));
    }
}
