package com.pfc.trasladoCuentas.dominio.repositorio;

import com.pfc.trasladoCuentas.repositorio.persistencia.entity.MovimientosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientosRepository extends JpaRepository<MovimientosEntity, Long> {
}