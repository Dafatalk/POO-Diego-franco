package com.biblioteca.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class biblioteca {
    private List<Recurso> R= new ArrayList<>();


    public void addRecurso (Recurso recurso){
        this.R.add(recurso);

    }
    public boolean Prestar(Recurso recurso){
        if(recurso instanceof Prestable){
            if(recurso.isPrestado()){
                return false;
            }
            else{
                ((Prestable) recurso).prestar();
                return true;
            }

        }
        return false;
    }
    public boolean devolverR(Recurso recurso){
        if(recurso instanceof Prestable){
            if(recurso.isPrestado()){
                ((Prestable) recurso).devolver();
                return true;

            }

        }

        return false;
    }
    public boolean fotocopiar(Recurso recurso){
        if (recurso instanceof Copiable){
            ((Copiable) recurso).copiar();
            return true;


        }
        return  false;
    }
    public List<String> ListarPrestados(List<Recurso> r){
        return this.R.stream().filter(c->c.isPrestado()).map(c->c.getNombre()).collect(Collectors.toList());


    }
    public void ListarCopias(List<Recurso>r){
        AtomicInteger copias = new AtomicInteger();

        R.forEach(v-> {
            if (v.getCopias()>0){
                System.out.println("el archivo"+v.getNombre()+"tiene"+v.getCopias());
            }
        });



    }

}

