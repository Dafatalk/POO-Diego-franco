package com.DispensadorDeDulces.app;
import com.DispensadorDeDulces.dominio.Dulce;
import com.DispensadorDeDulces.dominio.dispensadorDeDulce;
public class appDispensador {
    public static void main(String[] args0) {
        Dulce dulce = new Dulce("wafer", "chocolate");

        dispensadorDeDulce dispensador = new dispensadorDeDulce(marca:"dulexinhos", capacidad:100)
        dispensador.Dulce= dulce;
    }
}