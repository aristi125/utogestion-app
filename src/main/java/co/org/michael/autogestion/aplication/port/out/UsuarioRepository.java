package co.org.michael.autogestion.aplication.port.out;

import co.org.michael.autogestion.domain.model.Usuario;

public interface UsuarioRepository {
    Usuario findById(Long id);
    Usuario GetProfile();

}
