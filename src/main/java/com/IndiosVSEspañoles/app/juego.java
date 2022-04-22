package com.IndiosVSEspañoles.app;

import com.IndiosVSEspañoles.dominio.EspañolesVSIndios;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class juego {
    private static final int JUGAR = 0;
    private static final int PTOS = 1;
    private static final int INSTRUC = 2;

    //OP es OPCIÓN abreviado
    public static void main(String[] args) {
        int jugadorOP = 0;
        JCheckBox dificul = new JCheckBox("hardcore?");
        EspañolesVSIndios game = new EspañolesVSIndios("españoles, naturaleza e indios");
        String nickA = null;
        while (true) {
            int OPMENU = JOptionPane.showOptionDialog(null, "qué quieres hacer?",
                    "INDIOS VS ESPAÑOLES", 0, 0,
                    null, Arrays.asList("jugar", "puntos", "como se juega?", dificul).toArray(), null);
            switch (OPMENU) {
                case JUGAR:
                    if(nickA == null){
                        nickA = InsertarNick();
                        game.setNick(nickA);
                    }
                    String OPGAME = (String) JOptionPane.showInputDialog(null,
                            "qué quiere elegir?","INDIOS VS ESPAÑOLES", 0,null,
                            Arrays.asList("Indio", "español", "naturaleza").toArray(),null);
                    if(OPGAME=="Indio"){
                        jugadorOP=EspañolesVSIndios.INDIO;
                    }
                    else if(OPGAME=="español"){
                        jugadorOP=EspañolesVSIndios.COLON;
                    }
                    else{
                        jugadorOP=EspañolesVSIndios.NATURAL;
                    }

                    Random a = new Random();
                    int ERan= EspañolesVSIndios.OP.get(a.nextInt(EspañolesVSIndios.OP.size()));
                    mostrarmsg("el PC eligio" + ERan);

                    mostrarmsg(game.getNick()+ game.play(jugadorOP,ERan));
                    break;


                case PTOS:
                    mostrarmsg("LOS PUNTOS SON" + game.getNick() + game.getGanadasJugador() + "\n"+
                            "puntajes del PC"+  game.getGanadasMaqui() + "\n"+ "empates" + game.getEmpate());
                    break;

                case INSTRUC:
                    JOptionPane.showMessageDialog(null,"como se juega \n"+
                            "\n" +
                            "ambos jugadores deberán elegír entre 3 opciones"+
                            "deberán contar hasta 3 y luego mostrarán su elección al MISMO TIEMPO"+
                            "\n"+
                            "\n"+
                            "las posibles elecciones son: "+
                            "\n"+
                            "Indio, Españól o Naturaleza"+
                            "\n"+
                            "el Indio le gana a la naturaleza, por como ellos aprendieron a manejarla"+"\n"+
                            "el Español le gana al indio, por que ellos están colonizando con armas" + "\n" +
                            "la naturaleza le gana al los españoles, porque ellos no saben manejarla" +
                            "\n" +
                            "si se eligie lo mismo va a contar como empate y en caso de "+ "\n"+
                            "empate, deberan repetir el juego hasta que desempaten" + "\n"+"\n" + "GG!!");
                    break;


            }


        }

    }
    public static String InsertarNick(){
        String nick;

        do{
            nick = JOptionPane.showInputDialog(null, "ingrese su nick: ");
        }while (nick ==null);
        return nick;
    }

    private static void mostrarmsg(String msg) {
        JOptionPane.showMessageDialog(null, msg, "INDIO VS ESPAÑOL", JOptionPane.PLAIN_MESSAGE,null);
    }
}