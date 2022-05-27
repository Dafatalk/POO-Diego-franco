package com.biblioteca.dominio;

public class manga extends Recurso implements Prestable {
    public boolean prestado;
    public String nombre;


    @Override
    public void prestar() {
        this.prestado=true;
    }

    @Override
    public void devolver() {
        this.prestado=false;

    }
}
