package co.org.michael.autogestion.infraestructure.adapter.rest;

import co.org.michael.autogestion.aplication.port.in.UsuarioUseCase;
import co.org.michael.autogestion.domain.model.Usuario;
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
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable Long userId) {
        Usuario usuario = usuarioUseCase.obtenerUsuario(userId);
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/my-profile")
    public ResponseEntity<Usuario> obtenerPerfil() {
        Usuario usuario = usuarioUseCase.obtenerPerfil();
        if (usuario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usuario);
    }
}
