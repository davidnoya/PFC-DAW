package com.pfc.trasladoCuentas.aplicacion.mapper;

import com.pfc.trasladoCuentas.repositorio.persistencia.entity.SolicitudTrasladoEntity;
import com.pfc.trasladoCuentas.interfaz.dto.SolicitudTrasladoDTO;
import org.springframework.stereotype.Component;

@Component
public class SolicitudTrasladoMapper {

    public SolicitudTrasladoEntity toEntity(SolicitudTrasladoDTO dto) {
        SolicitudTrasladoEntity entity = new SolicitudTrasladoEntity();
        entity.setFechaHora(dto.getFechaHora());
        entity.setEntidadSolicitante(dto.getEntidadSolicitante());
        entity.setEntidadDestinataria(dto.getEntidadDestinataria());
        entity.setIbanAntiguo(dto.getIbanAntiguo());
        entity.setIbanNuevo(dto.getIbanNuevo());
        entity.setTitular(dto.getTitular());
        entity.setNifTitular(dto.getNifTitular());
        entity.setNifRepresentante(dto.getNifRepresentante());
        entity.setRepresentante(dto.getRepresentante());
        entity.setPeticiones(dto.getPeticiones());
        entity.setActuaciones(dto.getActuaciones());
        entity.setEstado(dto.getEstado());
        return entity;
    }

    public SolicitudTrasladoDTO toDTO(SolicitudTrasladoEntity entity) {
        SolicitudTrasladoDTO dto = new SolicitudTrasladoDTO();
        dto.setReferencia(entity.getReferencia());
        dto.setFechaHora(entity.getFechaHora());
        dto.setEntidadSolicitante(entity.getEntidadSolicitante());
        dto.setEntidadDestinataria(entity.getEntidadDestinataria());
        dto.setIbanAntiguo(entity.getIbanAntiguo());
        dto.setIbanNuevo(entity.getIbanNuevo());
        dto.setTitular(entity.getTitular());
        dto.setNifTitular(entity.getNifTitular());
        dto.setNifRepresentante(entity.getNifRepresentante());
        dto.setRepresentante(entity.getRepresentante());
        dto.setPeticiones(entity.getPeticiones());
        dto.setActuaciones(entity.getActuaciones());
        dto.setEstado(entity.getEstado());
        return dto;
    }
}