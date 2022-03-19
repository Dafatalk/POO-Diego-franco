package com.dispesadorTaller.dominio;

public class snack {
    private String marca;
    private  int codigo;
    private int precio;
    private short unidades;
    private static int id;
    private static final int CANTIDAD_MAXIMA_DEL_MISMO_SNACK = 6;


    public snack(String marca, short unidades, int precio, int codigo){
        int siguienteCode= snack.id+1;
        snack.id++;

        this.codigo=siguienteCode;
        this.precio=precio;
        this.marca=marca;
        this.unidades=unidades;
    }
    public void aumentarUnidades(short unidadesAAumentar) {
        if ((this.unidades + unidadesAAumentar) > CANTIDAD_MAXIMA_DEL_MISMO_SNACK) {
            System.out.println("No se puede incluir esa cantidad al snack " + this.marca);
        } else {
            this.unidades += unidadesAAumentar;
        }
    }
    public String getMarca() {
        return marca;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public short getUnidades() {
        return unidades;
    }

    public static int getId() {
        return id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setUnidades(short unidades) {
        this.unidades = unidades;
    }
}
