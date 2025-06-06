package com.pfc.trasladoCuentas.interfaz.rest;

import com.pfc.trasladoCuentas.aplicacion.BancaService;
import com.pfc.trasladoCuentas.dominio.modelo.Banca;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/banca")
@CrossOrigin(origins = "http://localhost:4200")
public class BancaController {

    private final BancaService bancaService;

    public BancaController(BancaService bancaService) {
        this.bancaService = bancaService;
    }

    @GetMapping
    public Banca getResumenBanca() {
        return bancaService.obtenerResumenBanca();
    }
}