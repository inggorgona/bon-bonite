package com.bonite.bon.models;

public class IniciarSesionM {
    private String cedula;
    private String clave;

    public IniciarSesionM(String cedula, String clave) {
        this.cedula = cedula;
        this.clave = clave;
    }

    public String getCedula() { return cedula; }
    public String getClave() { return clave; }
}
