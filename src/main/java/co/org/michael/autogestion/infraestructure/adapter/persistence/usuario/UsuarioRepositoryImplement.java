package co.org.michael.autogestion.infraestructure.adapter.persistence.usuario;

import co.org.michael.autogestion.aplication.port.out.UsuarioRepository;
import co.org.michael.autogestion.domain.model.Usuario;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryImplement implements UsuarioRepository {
    private final UsuarioJpaRepository jpaRepository;

    public UsuarioRepositoryImplement(UsuarioJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return jpaRepository.findById(id)
                .map(e -> new Usuario(e.getId(), e.getNombre(),e.getEmail(),e.getNumCuenta(),e.getNumIdentificacion(),e.getNumTelefono(),e.getCreadoEn()))
                .orElse(null);
    }

    @Override
    public Usuario GetProfile() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return jpaRepository.findByEmail(username) .map(e -> new Usuario(e.getId(), e.getNombre(),e.getEmail(),e.getNumCuenta(),e.getNumIdentificacion(),e.getNumTelefono(),e.getCreadoEn()))
                .orElse(null);
    }
}
