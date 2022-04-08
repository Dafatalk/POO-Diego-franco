package com.dispesadorTaller.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class dispensadorT {
    private static final int NUMERO_MAXIMO_DE_SNAKS=12;
    private List<snack> snacks;

    public  dispensadorT(){this.snacks=new ArrayList<>();}

    public boolean agregarsnak(String marca, short precio, int codigo, short unidades){
        snack SnackPaagregar= new snack(marca, precio, codigo, unidades);
        if(snacks.size()<=NUMERO_MAXIMO_DE_SNAKS) {
            this.snacks.add(SnackPaagregar);
            System.out.println(snacks);;
            return true;
        }
        else {
            System.out.printf("ya no se pueden agregar más snacks");
            return false;
        }
    }
    public boolean sacarPorCode(int codigo, int cantidadAServir, snack snackARestar) {
        this.BuscarSnackCode(codigo);
        snackARestar = BuscarSnackCode(codigo);
        if (BuscarSnackCode(codigo) != null) {
            return sacar(snackARestar);

        }
        return false;
    }

    public boolean SacarPorNombre(String marca, snack snacknombre){
        this.BuscarSnackMarca(marca);
        snacknombre=BuscarSnackMarca(marca);
        if (BuscarSnackMarca(marca)!=null);{
            return sacar(snacknombre);
            }

        }

    public void AgregarUnidades(int codigo,snack snackAAgregar){
        snackAAgregar=BuscarSnackCode(codigo);

        if(BuscarSnackCode(codigo)!=null) {
            snackAAgregar.setUnidades(snackAAgregar.getUnidades()+1);


        }


    }


    public void eliminar(String marca,snack SnackAEliminar){;
    this.BuscarSnackMarca(marca);
    SnackAEliminar=this.BuscarSnackMarca(marca);
    if(SnackAEliminar!=null) {
        this.snacks.remove(SnackAEliminar);
        System.out.println("el snack " + SnackAEliminar.getMarca() + "ha sido eliminado" );
    }
    else{
        System.out.println("el snack que quiere eliminar no se encuentra ");
    }

    }
    public void buscarCantidad(String marca){
     snack SnackCantidad = this.BuscarSnackMarca(marca);
        System.out.println("la canatidad de este snack es" +SnackCantidad.getUnidades());

    }
    public snack buscarAgotados(){
    AtomicReference<snack> agotados= new AtomicReference<>();
        this.snacks.forEach(Snack-> {
            if(Snack.getUnidades()==0){
                agotados.set(Snack);
            }
        });
        return agotados.get();
    }
    public void mostrarTodo(){
        this.snacks.forEach(Todo-> System.out.println(Todo.getMarca() + " "+ Todo.getUnidades()));

    }
    public void ordenarASC(){
        this.snacks.sort(Comparator.comparing(snack::getPrecio).thenComparing(snack::getCodigo));
        this.mostrarTodo();

    }
    public void ordenarDES(){
        this.snacks.sort(Comparator.comparing(snack::getPrecio).reversed().thenComparing(snack::getCodigo));

    }
    public snack BuscarSnackMarca(String marca){
        snack SnakABuscarM = this.snacks.stream()
                .filter(contacto -> contacto.getMarca()==marca).findFirst()
                .orElse(null);
        return SnakABuscarM;

    }
    public snack BuscarSnackCode(int codigo){
        snack SnakABuscar = this.snacks.stream()
                .filter(contacto -> contacto.getCodigo()==codigo).findFirst()
                .orElse(null);
        return SnakABuscar;
    }
    public boolean sacar(snack snackASacar) {
        if (snackASacar != null) {
            snackASacar.setUnidades(snackASacar.getUnidades() - 1);
            return true;
        }
        else {
        return false;
    }
    }


}
