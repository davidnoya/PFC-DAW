package com.pfc.trasladoCuentas.dominio.modelo;

public class Tarjeta {
    private String tipo;
    private String numero;
    private double disponible;

    public Tarjeta() {
    }

    public Tarjeta(String tipo, String numero, double disponible) {
        this.tipo = tipo;
        this.numero = numero;
        this.disponible = disponible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getDisponible() {
        return disponible;
    }

    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }
}