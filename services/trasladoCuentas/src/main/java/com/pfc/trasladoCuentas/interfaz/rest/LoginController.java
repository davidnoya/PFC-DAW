package com.pfc.trasladoCuentas.interfaz.rest;

import com.pfc.trasladoCuentas.aplicacion.mapper.LoginMapper;
import com.pfc.trasladoCuentas.aplicacion.LoginService;
import com.pfc.trasladoCuentas.interfaz.dto.LoginDTO;
import com.pfc.trasladoCuentas.dominio.modelo.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginMapper loginMapper;

    @PostMapping
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        Login login = loginMapper.dtoToLogin(loginDTO);
        boolean autenticado = loginService.autenticarUsuario(login);

        if (autenticado) {
            return ResponseEntity.ok("Login correcto");
        } else {
            return ResponseEntity.status(401).body("Credenciales inválidas");
        }
    }
}