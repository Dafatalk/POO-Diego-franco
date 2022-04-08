package com.PARCIAL.dominio;

public class enfermedad {
    private String nombre;
    private int gravedad=0;
    private static final int MAXIMA_GRAVEDAD = 3;

    public enfermedad(String nombre, int gravedad){
        this.gravedad=gravedad;
        this.nombre=nombre;
    }
    public enfermedad(String nombre){
        this.nombre=nombre;

    }
    public void GravedadD(short NumeroDeGravedad) {
        if ((this.gravedad + NumeroDeGravedad  ) > MAXIMA_GRAVEDAD) {
            System.out.println("No existe mayor gravedad que 3 ");
        } else {
            this.gravedad += NumeroDeGravedad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }
}

