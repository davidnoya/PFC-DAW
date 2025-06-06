package com.pfc.trasladoCuentas.aplicacion;

import com.pfc.trasladoCuentas.dominio.modelo.Usuario;

public interface UsuarioService {
    Usuario registrarUsuario(Usuario usuario) throws Exception;
}