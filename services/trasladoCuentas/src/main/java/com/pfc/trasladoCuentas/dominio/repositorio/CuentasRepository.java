package com.pfc.trasladoCuentas.dominio.repositorio;

import com.pfc.trasladoCuentas.repositorio.persistencia.entity.CuentasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentasRepository extends JpaRepository<CuentasEntity, String> {
}