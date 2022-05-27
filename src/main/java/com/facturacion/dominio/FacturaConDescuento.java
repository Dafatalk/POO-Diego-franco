package com.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaConIva{
    public FacturaConDescuento(long valor, String cliente, LocalDate fechaVencimiento) {
        super(valor, cliente, fechaVencimiento);
    }

    @Override
    public long calculartotal() {
        return super.calculartotal()-CalcularDescuento();
    }

    public long CalcularDescuento(){
        return (this.getValor()*30)/100;

    }
}
