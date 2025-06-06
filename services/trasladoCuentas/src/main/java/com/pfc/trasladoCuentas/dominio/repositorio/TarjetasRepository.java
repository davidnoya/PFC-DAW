package com.pfc.trasladoCuentas.dominio.repositorio;

import com.pfc.trasladoCuentas.repositorio.persistencia.entity.TarjetasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetasRepository extends JpaRepository<TarjetasEntity, String> {
}