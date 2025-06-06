package com.pfc.trasladoCuentas.interfaz.rest;

import com.pfc.trasladoCuentas.aplicacion.SolicitudTrasladoService;
import com.pfc.trasladoCuentas.interfaz.dto.SolicitudTrasladoDTO;

import jakarta.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/traslados")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class SolicitudTrasladoController {

    private final SolicitudTrasladoService service;

    public SolicitudTrasladoController(SolicitudTrasladoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> crearSolicitud(@RequestBody SolicitudTrasladoDTO dto, HttpSession session) {
        if (session.getAttribute("dniUsuario") == null) {
            return ResponseEntity.status(401).body("No autorizado");
        }
        SolicitudTrasladoDTO resultado = service.crearSolicitud(dto);
        return ResponseEntity.ok(resultado);
    }

    @GetMapping
    public ResponseEntity<?> obtenerSolicitudes(HttpSession session) {
        if (session.getAttribute("dniUsuario") == null) {
            return ResponseEntity.status(401).body("No autorizado");
        }
        List<SolicitudTrasladoDTO> lista = service.obtenerTodas();
        return ResponseEntity.ok(lista);
    }

}