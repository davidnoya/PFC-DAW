package com.pfc.trasladoCuentas.aplicacion.negocio;

import com.pfc.trasladoCuentas.aplicacion.mapper.SolicitudTrasladoMapper;
import com.pfc.trasladoCuentas.aplicacion.SolicitudTrasladoService;
import com.pfc.trasladoCuentas.repositorio.persistencia.entity.SolicitudTrasladoEntity;
import com.pfc.trasladoCuentas.interfaz.dto.SolicitudTrasladoDTO;
import com.pfc.trasladoCuentas.dominio.repositorio.SolicitudTrasladoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SolicitudTrasladoServiceImpl implements SolicitudTrasladoService {

    private final SolicitudTrasladoRepository repository;
    private final SolicitudTrasladoMapper mapper;

    public SolicitudTrasladoServiceImpl(SolicitudTrasladoRepository repository, SolicitudTrasladoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    private String generarNuevaReferencia() {
        List<String> referencias = repository.findAllReferenciasOrderByReferenciaDesc();

        if (referencias == null || referencias.isEmpty()) {
            return "REF001";
        }

        String ultimaReferencia = referencias.get(0);

        int numero = 0;

        try {
            numero = Integer.parseInt(ultimaReferencia.substring(3));
        } catch (NumberFormatException e) {
            numero = 0;
        }

        numero++;

        return String.format("REF%03d", numero);
    }

    @Override
    public SolicitudTrasladoDTO crearSolicitud(SolicitudTrasladoDTO dto) {
    	dto.setFechaHora(LocalDateTime.now());
    	dto.setEstado("PENDIENTE");
        SolicitudTrasladoEntity entity = mapper.toEntity(dto);
        entity.setReferencia(generarNuevaReferencia());
        SolicitudTrasladoEntity guardado = repository.save(entity);
        return mapper.toDTO(guardado);
    }

    @Override
    public List<SolicitudTrasladoDTO> obtenerTodas() {
        return repository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}