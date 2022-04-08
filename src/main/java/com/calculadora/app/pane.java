package com.calculadora.app;


import javax.swing.*;
import java.util.Arrays;
import com.calculadora.dominio.calcu;

public class pane {
    private static final int SUMAR = 0;
    private static final int RESTAR = 1;
    private static final int MULTIPLICAR = 2;
    private static final int DIVIDIR = 3;
    private static ImageIcon icono = new ImageIcon("com/calculadora/app/calc.png");

    public static void main(String[] args) {
        calcu calcu= new calcu();
        JCheckBox redond = new JCheckBox("redondear");
        while (true) {
            int op = JOptionPane.showOptionDialog(null, "que Operacion deseas hacer?",
                    "calculadora", 0,
                    0, icono,
                    Arrays.asList("sumar", "restar", "multiplicar", "dividir", redond).toArray(), 0);
            int numero1;
            int numero2;
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero",icono));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero",icono));
            switch (op) {
                case SUMAR:
                    mostrarmsg("el resultado es "+ calcu.sumar(numero1,numero2) );
                    break;
                case RESTAR:
                    mostrarmsg("el resultado es "+ calcu.restar(numero1,numero2) );;
                    break;
                case MULTIPLICAR:
                    mostrarmsg("el resultado es "+ calcu.multiplicar(numero1,numero2) );
                    break;
                case DIVIDIR:
                    double result=calcu.dividir(numero1,numero2);
                    if(redond.isSelected()){
                        result=Math.round(result);
                    }
                    mostrarmsg("el resultado es "+result);
                    break;

                case JOptionPane.CLOSED_OPTION:
                    break;


            }

        }
    }
    private static void mostrarmsg(String msg) {
        JOptionPane.showMessageDialog(null, msg, "calculadora", JOptionPane.PLAIN_MESSAGE, icono);
    }
}