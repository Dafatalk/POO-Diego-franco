package com.calculadora.app;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.calculadora.dominio.calcu;

public class pane {
    private static final int SUMAR = 0;
    private static final int RESTAR = 1;
    private static final int MULTIPLICAR = 2;
    private static final int DIVIDIR = 3;
    private static final  int SALIR = -1;
    private static final int SI=0;
    private static final int NO =1;
    private static ImageIcon icono = new ImageIcon(pane.class.getResource("/calc.png"));//NO ME PONE EL ICONO AAAAAA!
    private List<Integer> calcu;


    public static void main(String[] args) {
        calcu calcu= new calcu();
        int op = 0;
        JCheckBox redond = new JCheckBox("redondear");
        List<Integer> cal= new ArrayList<>();
        while (op!=SALIR) {
             op = JOptionPane.showOptionDialog(null, "que Operacion deseas hacer?",
                    "calculadora", 0,
                    0, icono,
                    Arrays.asList("sumar", "restar", "multiplicar", "dividir", redond).toArray(), 0);
             if(op==SALIR){
                 break;
             }
            int numero1=0;
            int numero2 = 0;
            boolean pudo = true;
            boolean otroNum = true;
            int opi;
            do {
                try {
                    while (otroNum==true) {
                      int ingresar = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero",null));
                      cal.add(ingresar);

                        opi=JOptionPane.showOptionDialog(null,"quiere anadir otro numero?",
                                "calculadora", 0,0,icono,Arrays.asList("si","no").toArray(),0);
                        switch (opi){
                            case NO:
                                otroNum=false;
                        }


                    }
                } catch (Exception e) {
                    pudo = false;
                }
            }while (!pudo);


            switch (op) {
                case SUMAR:
                    mostrarmsg("el resultado es "+ calcu.sumar(cal) );
                    break;
                case RESTAR:
                    mostrarmsg("el resultado es "+ calcu.restar(cal) );;
                    break;
                case MULTIPLICAR:
                    mostrarmsg("el resultado es "+ calcu.multiplicar(cal) );
                    break;
                case DIVIDIR:
                    double result=calcu.dividir(cal);
                    if(redond.isSelected()){
                        result=Math.round(result);
                    }
                    mostrarmsg("el resultado es "+result);
                    break;


            }

        }
    }

    private static void mostrarmsg(String msg) {
        JOptionPane.showMessageDialog(null, msg, "calculadora", JOptionPane.PLAIN_MESSAGE, icono);
    }
}