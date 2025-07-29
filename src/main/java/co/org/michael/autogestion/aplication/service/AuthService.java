package co.org.michael.autogestion.aplication.service;

import co.org.michael.autogestion.aplication.port.in.AuthUseCase;
import co.org.michael.autogestion.aplication.port.out.AuthRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements AuthUseCase {
    private final AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public String authenticate(String username, String password) {
        return authRepository.authenticate(username, password);
    }
}
