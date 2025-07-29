package co.org.michael.autogestion.aplication.port.in;

import co.org.michael.autogestion.domain.model.Usuario;

public interface UsuarioUseCase {
    Usuario obtenerUsuario(Long id);
    Usuario obtenerPerfil();
}
