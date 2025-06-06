package com.pfc.trasladoCuentas.dominio.modelo;

public class Login {
    private String dni;
    private String password;

    public Login(String dni, String password) {
        this.dni = dni;
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public String getPassword() {
        return password;
    }
}