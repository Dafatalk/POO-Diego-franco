package com.calculadora.dominio;

import java.util.ArrayList;
import java.util.List;

public class calcu {
    private int numero1;
    private int numero2;
    private List<Integer> calcu;

    public calcu(){
        this.calcu= new ArrayList<Integer>();
    }

    public int sumar(int numero1, int numero2) {
        int res= numero1 + numero2;


        return res;
    }
    public int restar(int numero1, int numero2){
        int res= numero1 - numero2;

        return res;
    }
    public int dividir(int numero1, int numero2){
        int res= numero1 / numero2;
        return res;

    }
    public  int multiplicar(int numero1, int numeros2){
        int res= numero1 * numero2;
        return res;
    }


    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
