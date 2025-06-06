package com.pfc.trasladoCuentas.repositorio.persistencia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimientos")
public class MovimientosEntity {

    @Id
    private Long id;

    private String descripcion;
    private double cantidad;

    public Long getId() {
    	return id; 
    }
    
    public void setId(Long id) {
    	this.id = id; 
    }

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