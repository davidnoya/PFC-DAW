package com.pfc.trasladoCuentas.interfaz.dto;

import java.time.LocalDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;

public class SolicitudTrasladoDTO {

    private String referencia;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy / HH:mm")
    private LocalDateTime fechaHora;

    private String ibanAntiguo;

    private String entidadSolicitante;

    private String entidadDestinataria;

    private String ibanNuevo;

    private String titular;
    
    private String nifTitular;
    
    private String nifRepresentante;

    private String representante;

    private List<String> peticiones;

    private List<String> actuaciones;

    private String estado;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getIbanAntiguo() {
        return ibanAntiguo;
    }

    public void setIbanAntiguo(String ibanAntiguo) {
        this.ibanAntiguo = ibanAntiguo;
    }

    public String getEntidadSolicitante() {
        return entidadSolicitante;
    }

    public void setEntidadSolicitante(String entidadSolicitante) {
        this.entidadSolicitante = entidadSolicitante;
    }

    public String getEntidadDestinataria() {
        return entidadDestinataria;
    }

    public void setEntidadDestinataria(String entidadDestinataria) {
        this.entidadDestinataria = entidadDestinataria;
    }

    public String getIbanNuevo() {
        return ibanNuevo;
    }

    public void setIbanNuevo(String ibanNuevo) {
        this.ibanNuevo = ibanNuevo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String getNifTitular() {
        return nifTitular;
    }

    public void setNifTitular(String nifTitular) {
        this.nifTitular = nifTitular;
    }

    public String getNifRepresentante() {
        return nifRepresentante;
    }

    public void setNifRepresentante(String nifRepresentante) {
        this.nifRepresentante = nifRepresentante;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public List<String> getPeticiones() {
        return peticiones;
    }

    public void setPeticiones(List<String> peticiones) {
        this.peticiones = peticiones;
    }

    public List<String> getActuaciones() {
        return actuaciones;
    }

    public void setActuaciones(List<String> actuaciones) {
        this.actuaciones = actuaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}