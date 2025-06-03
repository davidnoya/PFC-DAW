package com.pfc.trasladoCuentas.aplicacion.negocio;

import com.pfc.trasladoCuentas.aplicacion.UsuarioService;
import com.pfc.trasladoCuentas.dominio.modelo.Usuario;
import com.pfc.trasladoCuentas.dominio.repositorio.UsuarioRepository;
import com.pfc.trasladoCuentas.repositorio.persistencia.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario registrarUsuario(Usuario usuario) throws Exception {
        if (usuarioRepository.existsByDni(usuario.getDni())) {
            throw new Exception("El usuario ya existe");
        }

        UsuarioEntity entity = new UsuarioEntity(
            usuario.getDni(),
            usuario.getPassword(),
            usuario.getNombre(),
            usuario.getEmail()
        );
        usuarioRepository.save(entity);
        return usuario;
    }
}