package com.PARCIAL.dominio;

import java.util.List;

public class Paciente {
    private int cedula;
    private String nombre;
    private enfermedad enfermedad;
    private List<enfermedad>enfermedades;
    public  Paciente(int cedula, String nombre,enfermedad enfermedad){

        this.cedula=cedula;
        this.nombre=nombre;
        this.enfermedad=enfermedad;
    }

    public void enfermedadAPaciente(String nombre, int gravedad){
        enfermedad ListaDeenfermedades= new enfermedad(nombre, gravedad);
        enfermedades.add(ListaDeenfermedades);



    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public com.PARCIAL.dominio.enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(com.PARCIAL.dominio.enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }
}
