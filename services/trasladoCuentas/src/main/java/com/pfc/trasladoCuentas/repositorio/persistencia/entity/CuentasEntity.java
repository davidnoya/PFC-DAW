package com.pfc.trasladoCuentas.repositorio.persistencia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuentas")
public class CuentasEntity {

    @Id
    private String numero;

    private String tipo;
    private double saldo;

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

    public double getSaldo() {
    	return saldo; 
    }
    
    public void setSaldo(double saldo) {
    	this.saldo = saldo; 
    }
}