package com.figurasActividad.dominio;

public class TrianguloIsoseles extends Triangulo {
    private double CO;
    private double CA;
    private double HIP;

    @Override
    public double calcularArea() {
    int h= (int) Math.sqrt(Math.pow(CA,2)-Math.pow(CO,2)/4);
        return (CA * h)/2 ;
    }

    @Override
    public double calcularPerimetro() {
    return CO+CA+HIP;
    }


    @Override
    public String toString() {
        return "triangulo isoseles";
    }
}
