package com.DispensadorDeDulces.dominio;

public class Dulce {
    public String marca;
    public String tipoDeDulce;

    public Dulce(String marca) {
        this.marca = marca;
    }

    public Dulce(String marca, String TipoDeazucar) {
        this.marca = marca;
        this.tipoDeDulce = TipoDeazucar;

    }

}
