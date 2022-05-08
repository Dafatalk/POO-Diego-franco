package com.figurasActividad.dominio;

public class TrianguloEquilatero extends Triangulo {
    private double lado;

    public TrianguloEquilatero (double lado){
        this.lado=lado;
    }


    @Override
    public double calcularArea() {
        return Math.pow(lado,2)*Math.sqrt(3)/4;
    }

    @Override
    public double calcularPerimetro() {
        return 3*(lado);
    }

    @Override
    public String toString() {
        return "triangulo Equilatero";
    }

}
