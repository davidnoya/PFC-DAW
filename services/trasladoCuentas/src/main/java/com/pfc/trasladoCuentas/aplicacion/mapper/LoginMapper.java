package com.pfc.trasladoCuentas.aplicacion.mapper;

import com.pfc.trasladoCuentas.interfaz.dto.LoginDTO;
import com.pfc.trasladoCuentas.dominio.modelo.Login;
import org.springframework.stereotype.Component;

@Component
public class LoginMapper {

    public Login dtoToLogin(LoginDTO loginDTO) {
        return new Login(loginDTO.getDni(), loginDTO.getPassword());
    }
}