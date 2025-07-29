package co.org.michael.autogestion.infraestructure.adapter.rest;

import co.org.michael.autogestion.aplication.port.in.AuthUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
private final AuthUseCase authUseCase;

    public AuthController(AuthUseCase authUseCase) {
        this.authUseCase = authUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login( @RequestParam String email,@RequestParam String password) {
        return ResponseEntity.ok(authUseCase.authenticate(email, password));
    }
}
