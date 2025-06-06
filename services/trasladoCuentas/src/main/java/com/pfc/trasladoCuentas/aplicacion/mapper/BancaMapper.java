package com.pfc.trasladoCuentas.aplicacion.mapper;

import com.pfc.trasladoCuentas.dominio.modelo.Cuenta;
import com.pfc.trasladoCuentas.dominio.modelo.Movimiento;
import com.pfc.trasladoCuentas.dominio.modelo.Tarjeta;
import com.pfc.trasladoCuentas.interfaz.dto.*;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BancaMapper {

    public BancaDTO toDTO(List<Cuenta> cuentas, List<Tarjeta> tarjetas, List<Movimiento> movimientos) {
        BancaDTO dto = new BancaDTO();
        dto.setCuentas(cuentas.stream().map(this::toCuentasDTO).collect(Collectors.toList()));
        dto.setTarjetas(tarjetas.stream().map(this::toTarjetasDTO).collect(Collectors.toList()));
        dto.setMovimientos(movimientos.stream().map(this::toMovimientosDTO).collect(Collectors.toList()));
        return dto;
    }

    private CuentasDTO toCuentasDTO(Cuenta cuenta) {
        CuentasDTO dto = new CuentasDTO();
        dto.setTipo(cuenta.getTipo());
        dto.setNumero(cuenta.getNumero());
        dto.setSaldo(cuenta.getSaldo());
        return dto;
    }

    private TarjetasDTO toTarjetasDTO(Tarjeta tarjeta) {
        TarjetasDTO dto = new TarjetasDTO();
        dto.setTipo(tarjeta.getTipo());
        dto.setNumero(tarjeta.getNumero());
        dto.setDisponible(tarjeta.getDisponible());
        return dto;
    }

    private MovimientosDTO toMovimientosDTO(Movimiento movimiento) {
        MovimientosDTO dto = new MovimientosDTO();
        dto.setDescripcion(movimiento.getDescripcion());
        dto.setCantidad(movimiento.getCantidad());
        return dto;
    }
}