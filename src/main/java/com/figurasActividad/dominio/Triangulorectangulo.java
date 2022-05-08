package com.figurasActividad.dominio;

public class Triangulorectangulo extends Triangulo {
    private double CO;
    private double CA;
    private double HIP;

    public Triangulorectangulo(int CO, int HIP, int CA){
        this.CO=CO;
        this.CA=CA;
        this.HIP=HIP;
    }

    @Override
    public double calcularArea() {
        int h= (int) Math.sqrt(Math.pow(CA,2)-Math.pow(CO,2)/4);
        return CO*h;
    }

    @Override
    public double calcularPerimetro() {
        return CA+CO+HIP;
    }

    @Override
    public String toString() {
        return "triangulo rectangulo";
    }
}
