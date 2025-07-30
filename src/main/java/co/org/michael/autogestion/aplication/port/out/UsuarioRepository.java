package co.org.michael.autogestion.aplication.port.out;

import co.org.michael.autogestion.domain.model.UsuarioDTO;

public interface UsuarioRepository {
    UsuarioDTO findById(Long id);
    UsuarioDTO GetProfile();

}
