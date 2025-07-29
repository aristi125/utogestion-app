package co.org.michael.autogestion.infraestructure.adapter.persistence.usuario;

import co.org.michael.autogestion.infraestructure.adapter.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UsuarioJpaRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByNumIdentificacion(String numIdentificacion);

    Optional<UsuarioEntity> findByEmail(String email);

    boolean existsByEmail(String email);

}
