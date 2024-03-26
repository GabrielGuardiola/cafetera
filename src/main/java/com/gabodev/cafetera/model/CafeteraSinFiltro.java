package com.gabodev.cafetera.model;

public class CafeteraSinFiltro extends CafeteraBase{

    public CafeteraSinFiltro(String marca, String modelo) {
        super(marca, modelo,false,100,100);
    }
    @Override
    public Cafe hacerCafe(TipoCafe tipoCafe) {
        Cafe newCafe = new Cafe(tipoCafe.getTipo(), false);
        return newCafe;
    }
}
