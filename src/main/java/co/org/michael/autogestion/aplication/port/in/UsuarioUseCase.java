package co.org.michael.autogestion.aplication.port.in;

import co.org.michael.autogestion.domain.model.UsuarioDTO;

public interface UsuarioUseCase {
    UsuarioDTO obtenerUsuario(Long id);
    UsuarioDTO obtenerPerfil();
}
