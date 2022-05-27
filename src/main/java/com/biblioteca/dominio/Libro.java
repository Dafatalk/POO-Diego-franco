package com.biblioteca.dominio;

public class Libro extends Recurso implements Copiable,Prestable{
    public boolean prestado;
    public String nombre;
    public int copias;
    @Override
    public void copiar() {
        this.copias++;

    }

    @Override
    public void prestar() {
        this.prestado=true;

    }

    @Override
    public void devolver() {
        this.prestado=false;

    }
}
