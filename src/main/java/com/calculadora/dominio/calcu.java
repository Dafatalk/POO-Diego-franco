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

    public int sumar(List<Integer> nros) {
        return nros.stream().mapToInt(nro -> nro).sum();
        }

    public static int restar(List<Integer> nros){

        return nros.stream().mapToInt(nro->nro).reduce((numero1 , numero2) -> numero1 - numero2).getAsInt();
    }
    public int dividir(List<Integer> nros){
        return nros.stream().mapToInt(nro->nro).reduce((numero1 , numero2) -> numero1 / numero2).getAsInt();

    }
    public  int multiplicar(List<Integer> nros){
        return nros.stream().mapToInt(nro->nro).reduce((numero1 , numero2) -> numero1 * numero2).getAsInt();

    }


}
