package com.biblioteca.dominio;

public class periodico extends Recurso implements Copiable {
    public int copias;
    public String nombre;

    @Override
    public void copiar() {
        this.copias++;
    }
}
