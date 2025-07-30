package co.org.michael.autogestion.aplication.service;

import co.org.michael.autogestion.aplication.port.in.UsuarioUseCase;
import co.org.michael.autogestion.aplication.port.out.UsuarioRepository;
import co.org.michael.autogestion.domain.model.UsuarioDTO;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicie implements UsuarioUseCase {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServicie(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioDTO obtenerUsuario(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public UsuarioDTO obtenerPerfil() {
        return usuarioRepository.GetProfile();
    }
}
