package com.facturacion.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura {
    public static final long VALOR_x_DIA=10000;
    public FacturaVencida(long valor, String cliente, LocalDate fechaVencimiento){
        super(valor, cliente,fechaVencimiento);
    }

    @Override
    public long calculartotal() {
        if (getValor()>100000){
        return (this.getValor()+(getValor()*19)/100)+diasDeVencimiento();}
        else {
          return this.getValor()+diasDeVencimiento();
        }
    }


    public long diasDeVencimiento(){
        LocalDate hoy = LocalDate.now();
        long diasVencidos=0;
        diasVencidos= ChronoUnit.DAYS.between(getFechaVencimiento(),hoy);
        return diasVencidos*VALOR_x_DIA;
    }
}
