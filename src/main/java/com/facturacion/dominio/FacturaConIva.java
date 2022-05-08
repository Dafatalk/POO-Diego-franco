package com.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConIva extends Factura {

    public FacturaConIva(long valor, String cliente, LocalDate fechaVencimiento){
        super(valor,cliente,fechaVencimiento);
    }

    @Override
    public long calculartotal() {
        return this.getValor()+(getValor()*19)/2;
    }
}
