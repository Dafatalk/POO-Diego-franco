package com.agendaTelefonica.dominio;

public class Contacto {
    private String nombre;
    private String apellido;
    private long telef;



    public Contacto (String nombre, String apellido,long telef){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telef = telef;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelef() {
        return telef;
    }

    public void setTelef(long telef) {
        this.telef = telef;
    }
}
