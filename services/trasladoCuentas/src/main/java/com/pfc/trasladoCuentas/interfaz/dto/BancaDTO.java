package com.pfc.trasladoCuentas.interfaz.dto;

import java.util.List;

public class BancaDTO {
    private List<CuentasDTO> cuentas;
    private List<TarjetasDTO> tarjetas;
    private List<MovimientosDTO> movimientos;

    public List<CuentasDTO> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentasDTO> cuentas) {
        this.cuentas = cuentas;
    }

    public List<TarjetasDTO> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<TarjetasDTO> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public List<MovimientosDTO> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<MovimientosDTO> movimientos) {
        this.movimientos = movimientos;
    }
}