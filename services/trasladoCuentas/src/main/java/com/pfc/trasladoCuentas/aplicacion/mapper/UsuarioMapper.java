package com.pfc.trasladoCuentas.aplicacion.mapper;

import com.pfc.trasladoCuentas.dominio.modelo.Usuario;
import com.pfc.trasladoCuentas.interfaz.dto.UsuarioDTO;
import com.pfc.trasladoCuentas.repositorio.persistencia.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario dtoToUsuario(UsuarioDTO dto) {
        return new Usuario(dto.getDni(), dto.getPassword(), dto.getNombre(), dto.getEmail());
    }

    public UsuarioEntity usuarioToEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getDni(), usuario.getPassword(), usuario.getNombre(), usuario.getEmail());
    }

    public UsuarioDTO entityToDto(UsuarioEntity entity) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setDni(entity.getDni());
        dto.setPassword(entity.getPassword());
        dto.setNombre(entity.getNombre());
        dto.setEmail(entity.getEmail());
        return dto;
    }
}