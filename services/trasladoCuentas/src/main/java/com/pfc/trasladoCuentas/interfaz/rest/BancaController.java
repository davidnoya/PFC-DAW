package com.pfc.trasladoCuentas.interfaz.rest;

import com.pfc.trasladoCuentas.aplicacion.BancaService;
import com.pfc.trasladoCuentas.dominio.modelo.Banca;

import jakarta.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/banca")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class BancaController {

    private final BancaService bancaService;

    public BancaController(BancaService bancaService) {
        this.bancaService = bancaService;
    }

    @GetMapping
    public ResponseEntity<?> getResumenBanca(HttpSession session) {
        if (session.getAttribute("dniUsuario") == null) {
            return ResponseEntity.status(401).body("No autorizado");
        }
        Banca banca = bancaService.obtenerResumenBanca();
        return ResponseEntity.ok(banca);
    }
}