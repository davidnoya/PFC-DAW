package com.pfc.trasladoCuentas.interfaz.dto;

public class CuentasDTO {
    private String tipo;
    private String numero;
    private double saldo;

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