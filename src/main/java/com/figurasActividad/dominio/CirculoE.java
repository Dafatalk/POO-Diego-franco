package com.figurasActividad.dominio;

public class CirculoE extends Geofigura {
    private double radio;

    public CirculoE(double radio){
        this.radio=radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*this.radio;
    }
}
