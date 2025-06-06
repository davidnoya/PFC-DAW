package com.pfc.trasladoCuentas.aplicacion.negocio;

import com.pfc.trasladoCuentas.aplicacion.LoginService;
import com.pfc.trasladoCuentas.repositorio.persistencia.entity.UsuarioEntity;
import com.pfc.trasladoCuentas.dominio.modelo.Login;
import com.pfc.trasladoCuentas.dominio.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public boolean autenticarUsuario(Login login) {
        Optional<UsuarioEntity> usuarioEntity = usuarioRepository.findByDniAndPassword(login.getDni(), login.getPassword());
        return usuarioEntity.isPresent();
    }
}