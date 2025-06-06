package com.pfc.trasladoCuentas.repositorio.persistencia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarjetas")
public class TarjetasEntity {

    @Id
    private String numero;

    private String tipo;
    private double disponible;

    public String getNumero() {
    	return numero; 
    }
    
    public void setNumero(String numero) {
    	this.numero = numero; 
    }

    public String getTipo() {
    	return tipo; 
    }
    
    public void setTipo(String tipo) {
    	this.tipo = tipo; 
    }

    public double getDisponible() {
    	return disponible; 
    }
    
    public void setDisponible(double disponible) {
    	this.disponible = disponible; 
    }
}