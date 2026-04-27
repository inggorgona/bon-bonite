package com.bonite.bon.models;

public class RegistroUsuarioM {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo;
    private String clave;
    private String confirmarClave;

    public RegistroUsuarioM(String cedula,
                            String nombres,
                            String apellidos,
                            String correo,
                            String clave,
                            String confirmarClave) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.clave = clave;
        this.confirmarClave = confirmarClave;
    }

    public String getCedula() { return cedula; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getCorreo() { return correo; }
    public String getClave() { return clave; }
    public String getConfirmarClave() { return confirmarClave; }
}