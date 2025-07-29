package co.org.michael.autogestion.infraestructure.adapter.persistence.auth;


import co.org.michael.autogestion.infraestructure.adapter.entity.UsuarioEntity;
import co.org.michael.autogestion.infraestructure.adapter.persistence.usuario.UsuarioJpaRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@NoArgsConstructor
@Service
public class AuthUserService implements UserDetailsService {
    @Autowired
    private UsuarioJpaRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UsuarioEntity user = userRepository.findByEmail(userName)
                .orElseThrow(() -> new UsernameNotFoundException("No se encontró ningún usuario con el correo:" + userName + ". Verifica que el correo este correcto y vuelve a intentarlo."));
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().getName());

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                Collections.singleton(authority)
        );
    }

    public boolean existsByUserName(String username) {
        return userRepository.existsByEmail(username);
    }

    public void save(UsuarioEntity user) {
        userRepository.save(user);
    }
}
