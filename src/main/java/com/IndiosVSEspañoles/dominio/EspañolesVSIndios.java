package com.IndiosVSEspañoles.dominio;

import java.util.Arrays;
import java.util.List;

public class EspañolesVSIndios {
public static final int INDIO =0;
public static final int COLON=1;
public static final int NATURAL=2;

public static final List<Integer> OP = Arrays.asList(INDIO, COLON, NATURAL);
private String juegoname;
private String nick;
private int ganadasJugador;
private int ganadasMaqui;
private int empate;

public EspañolesVSIndios (String juegoname){

    this.juegoname=juegoname;
}
public EspañolesVSIndios(String nick, int ganadasusua, int ganadasMaqui, int empate){
    this.nick=nick;
    this.ganadasJugador=ganadasJugador;
    this.ganadasMaqui=ganadasMaqui;
    this.empate=empate;
}
public String play(int usuario, int maquina){
    if(usuario==INDIO &&maquina==NATURAL){
        ganadasJugador++;
        return  "has ganado cv!";
    }
    else if(usuario==NATURAL && maquina==COLON){
        ganadasJugador++;
        return  "has ganado cv!";
    }
    else if(usuario==COLON&&maquina==INDIO){
        ganadasJugador++;
        return  "has ganado cv!";
    }
    else if(usuario==maquina){
        empate++;
        return "muchas lks, tomaron la misma cosa.";
    }
    else{
        maquina++;
       return"te ganó una maquina XD";
    }
}

    public String getJuegoname() {
        return juegoname;
    }

    public String getNick() {
        return nick;
    }

    public int getGanadasJugador() {
        return ganadasJugador;
    }

    public int getGanadasMaqui() {
        return ganadasMaqui;
    }

    public int getEmpate() {
        return empate;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setGanadasJugador(int ganadasJugador) {
        this.ganadasJugador = ganadasJugador;
    }

    public void setGanadasMaqui(int ganadasMaqui) {
        this.ganadasMaqui = ganadasMaqui;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

}
