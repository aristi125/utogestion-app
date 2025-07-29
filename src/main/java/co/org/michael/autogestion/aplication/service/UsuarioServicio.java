package co.org.michael.autogestion.aplication.service;

import co.org.michael.autogestion.aplication.port.in.UsuarioUseCase;
import co.org.michael.autogestion.aplication.port.out.UsuarioRepository;
import co.org.michael.autogestion.domain.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio implements UsuarioUseCase {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServicio(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario obtenerPerfil() {
        return usuarioRepository.GetProfile();
    }
}
