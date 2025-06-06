package com.pfc.trasladoCuentas.dominio.repositorio;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.pfc.trasladoCuentas.repositorio.persistencia.entity.SolicitudTrasladoEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SolicitudTrasladoRepository extends JpaRepository<SolicitudTrasladoEntity, String> {
	
    @Query("SELECT s.referencia FROM SolicitudTrasladoEntity s ORDER BY s.referencia DESC")
    List<String> findAllReferenciasOrderByReferenciaDesc();
}