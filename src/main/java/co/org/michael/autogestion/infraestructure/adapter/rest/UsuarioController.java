package co.org.michael.autogestion.infraestructure.adapter.rest;

import co.org.michael.autogestion.aplication.port.in.UsuarioUseCase;
import co.org.michael.autogestion.domain.model.UsuarioDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    private final UsuarioUseCase usuarioUseCase;

    public UsuarioController(UsuarioUseCase usuarioUseCase) {
        this.usuarioUseCase = usuarioUseCase;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UsuarioDTO> obtenerUsuario(@PathVariable Long userId) {
        UsuarioDTO usuario = usuarioUseCase.obtenerUsuario(userId);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/my-profile")
    public ResponseEntity<UsuarioDTO> obtenerPerfil() {
        UsuarioDTO usuario = usuarioUseCase.obtenerPerfil();
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }
}
