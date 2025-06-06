package com.pfc.trasladoCuentas.aplicacion;

import com.pfc.trasladoCuentas.interfaz.dto.SolicitudTrasladoDTO;

import java.util.List;

public interface SolicitudTrasladoService {

    SolicitudTrasladoDTO crearSolicitud(SolicitudTrasladoDTO dto);

    List<SolicitudTrasladoDTO> obtenerTodas();
}