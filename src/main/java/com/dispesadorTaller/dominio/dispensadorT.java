package com.dispesadorTaller.dominio;
import com.agendaTelefonica.dominio.Contacto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class dispensadorT {
    private static final int NUMERO_MAXIMO_DE_SNAKS=12;
    private int cantidadActual;
    private List<snack> snacks;

    public  dispensadorT(){this.snacks=new ArrayList<>();}
    public void agregarsnak(String marca, short precio, int codigo, short unidades){
        snack SnackPaagregar= new snack(marca, precio, codigo, unidades);
        if(snacks.size()<=NUMERO_MAXIMO_DE_SNAKS) {
            this.snacks.add(SnackPaagregar);
        }
        else
            System.out.printf("ya no se pueden agregar más snacks");

    }
    public void sacarPorCode(int codigo, int cantidadAServir){
        this.BuscarSnackCode(codigo);
        //aqui me da un error y no entiendo por qué.
        if(BuscarSnackCode(codigo);){
            if (cantidadAServir <= this.cantidadActual) {
                this.cantidadActual -= cantidadAServir;
                System.out.println("Se sirvió melo");
                System.out.println("Queda " + this.cantidadActual + " del snack ");

            }
            else{
                System.out.println("ya no hay de ese snack :( F");

        }

        }

    }
    public Void SacarPorNombre(String marca, int cantidadAservir){
        this.BuscarSnackMarca(marca);
        if (BuscarSnackCode(marca));{
            if (cantidadAservir <= this.cantidadActual) {
                this.cantidadActual -= cantidadAservir;
                System.out.println("Se sirvió melo");
                System.out.println("Queda " + this.cantidadActual + " del snack ");

            }
            else{
                System.out.println("ya no hay de ese snack :( F");

            }

        }

    }
    public void AgregarUnidades(short UnidadesAAumentar, String marca, int codigo){
        this.BuscarSnackMarca(marca);
        this.BuscarSnackCode(codigo);
        if(BuscarSnackCode(codigo) || BuscarSnackMarca(marca)){
            this.cantidadActual = this.cantidadActual+UnidadesAAumentar;
            System.out.println("El dispensador se llenó");

        }


    }

    public void eliminar(String marca){;

    }
    public void buscarCantidad(){

    }
    public void buscarAgotados(){

    }
    public void mostrarTodo(){

    }
    public void ordenarASC(){

    }
    public void ordenarDES(){

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



}
