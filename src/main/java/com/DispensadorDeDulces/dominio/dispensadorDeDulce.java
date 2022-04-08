package com.DispensadorDeDulces.dominio;

public class dispensadorDeDulce {
    public static final short CANTIDAD_DE=10;
    public String marca;
    public int capacidad;
    public int cantidadActual;
    public Dulce Dulce;

    public dispensadorDeDulce(String marca, double capacidad) {
        this.marca = marca;
        this.capacidad = (int) capacidad;
    }

    public boolean servir(int cantidadAServir) {
        if (cantidadAServir <= this.cantidadActual) {
            this.cantidadActual -= cantidadAServir;
            System.out.println("Se sirvió bien...");
            System.out.println("Queda " + this.cantidadActual + " de cerveza " + this.Dulce.marca);
            return true;
        }

        System.out.println("No se pudo servir.");
        return false;
    }

    public void cambiarMarca(Dulce nuevoDulce) {
        this.vaciar();
        this.Dulce = nuevoDulce;
        this.llenar();
    }

    public void llenar() {
        this.cantidadActual = this.capacidad;
        System.out.println("El dispensador se llenó con " + this.Dulce.marca);
    }

    public void vaciar() {
        this.cantidadActual = 0;
        System.out.println("El dispensador se vació con exito.");
    }

}
