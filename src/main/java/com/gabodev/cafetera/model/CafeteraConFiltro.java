package com.gabodev.cafetera.model;

public class CafeteraConFiltro extends CafeteraBase{

    public CafeteraConFiltro(String marca, String modelo) {
        super(marca, modelo,false,100,100);
    }
    @Override
    public Cafe hacerCafe(TipoCafe tipoCafe) {
        Cafe newCafe = new Cafe(tipoCafe.getTipo(), true);
        return newCafe;
    }
}
