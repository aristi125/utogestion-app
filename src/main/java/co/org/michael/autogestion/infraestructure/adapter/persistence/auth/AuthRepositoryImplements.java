package co.org.michael.autogestion.infraestructure.adapter.persistence.auth;

import co.org.michael.autogestion.aplication.port.out.AuthRepository;
import co.org.michael.autogestion.infraestructure.adapter.config.jwt.JwtUtil;
import co.org.michael.autogestion.infraestructure.adapter.entity.UsuarioEntity;
import co.org.michael.autogestion.infraestructure.adapter.persistence.usuario.UsuarioJpaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

@Repository
public class AuthRepositoryImplements implements AuthRepository {

    private final AuthUserService authUserService;
    private final UsuarioJpaRepository usuarioJpaRepository;
    private final JwtUtil jwtUtil;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;

    public AuthRepositoryImplements(AuthUserService authUserService, UsuarioJpaRepository usuarioJpaRepository, JwtUtil jwtUtil, AuthenticationManagerBuilder authenticationManagerBuilder) {
        this.authUserService = authUserService;
        this.usuarioJpaRepository = usuarioJpaRepository;
        this.jwtUtil = jwtUtil;
        this.authenticationManagerBuilder = authenticationManagerBuilder;
    }

    @Override
    public String authenticate(String username, String password) {
        try {
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);
            Authentication authResult = authenticationManagerBuilder.getObject().authenticate(authenticationToken);
            SecurityContextHolder.getContext().setAuthentication(authResult);

            UsuarioEntity usuario = usuarioJpaRepository.findByEmail(username)
                    .orElseThrow(() -> new EntityNotFoundException("No se encontró ningún usuario con el correo: " + username + ". Verifica que el correo este correcto y vuelve a intentarlo."));

            authUserService.save(usuario);

            return jwtUtil.generateToken(authResult);
        } catch (BadCredentialsException e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Usuario o contraseña incorrectos. Inténtalo nuevamente.");
        }
    }
}
