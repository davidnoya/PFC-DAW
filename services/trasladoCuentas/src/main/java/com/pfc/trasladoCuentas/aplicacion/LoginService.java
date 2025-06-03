package com.pfc.trasladoCuentas.aplicacion;

import com.pfc.trasladoCuentas.dominio.modelo.Login;

public interface LoginService {
    boolean autenticarUsuario(Login login);
}