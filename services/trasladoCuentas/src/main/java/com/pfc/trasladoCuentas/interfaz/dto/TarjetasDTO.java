package com.pfc.trasladoCuentas.interfaz.dto;

public class TarjetasDTO {
    private String tipo;
    private String numero;
    private double disponible;

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