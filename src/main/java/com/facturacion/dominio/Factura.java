package com.facturacion.dominio;

import java.time.LocalDate;

public abstract class Factura extends Facturacion{
    private long valor;
    private String cliente;
    private LocalDate fechaVencimiento;
    public Factura(long valor,String cliente,LocalDate fechaVencimiento){
        this.valor=valor;
        this.cliente=cliente;
        this.fechaVencimiento=fechaVencimiento;
    }
    public abstract long calculartotal();

    public long getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
}

