package com.pfc.trasladoCuentas.dominio.modelo;

import java.util.List;

public class Banca {

    private List<Cuenta> cuentas;
    private List<Tarjeta> tarjetas;
    private List<Movimiento> movimientos;

    public Banca(List<Cuenta> cuentas, List<Tarjeta> tarjetas, List<Movimiento> movimientos) {
        this.cuentas = cuentas;
        this.tarjetas = tarjetas;
        this.movimientos = movimientos;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}