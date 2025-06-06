package com.pfc.trasladoCuentas.interfaz.dto;

public class MovimientosDTO {
    private String descripcion;
    private double cantidad;

    public String getDescripcion() {
    	return descripcion; 
    }
    
    public void setDescripcion(String descripcion) {
    	this.descripcion = descripcion; 
    }

    public double getCantidad() {
    	return cantidad; 
    }
    
    public void setCantidad(double cantidad) {
    	this.cantidad = cantidad; 
    }
}