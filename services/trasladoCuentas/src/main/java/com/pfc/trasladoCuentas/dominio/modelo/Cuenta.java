package com.pfc.trasladoCuentas.dominio.modelo;

public class Cuenta {
    private String tipo;
    private String numero;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String tipo, String numero, double saldo) {
        this.tipo = tipo;
        this.numero = numero;
        this.saldo = saldo;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}