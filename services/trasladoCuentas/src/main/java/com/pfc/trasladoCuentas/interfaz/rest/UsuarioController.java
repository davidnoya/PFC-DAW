package com.pfc.trasladoCuentas.interfaz.rest;

import com.pfc.trasladoCuentas.aplicacion.UsuarioService;
import com.pfc.trasladoCuentas.aplicacion.mapper.UsuarioMapper;
import com.pfc.trasladoCuentas.dominio.modelo.Usuario;
import com.pfc.trasladoCuentas.interfaz.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioMapper usuarioMapper;

    @PostMapping("/registro")
    public ResponseEntity<String> registrar(@RequestBody UsuarioDTO usuarioDTO) {
        try {
            Usuario usuario = usuarioMapper.dtoToUsuario(usuarioDTO);
            usuarioService.registrarUsuario(usuario);
            return ResponseEntity.ok("Usuario registrado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}