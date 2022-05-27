package com.biblioteca.dominio;

public class Tesis extends Recurso implements Copiable{
    public String nombre;
    public int copias;
    @Override
    public void copiar() {
        this.copias++;

    }
}
