package com.pfc.trasladoCuentas.dominio.repositorio;

import com.pfc.trasladoCuentas.repositorio.persistencia.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
    Optional<UsuarioEntity> findByDniAndPassword(String dni, String password);

    boolean existsByDni(String dni);
}