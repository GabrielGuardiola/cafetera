package com.gabodev.cafetera.model;

public class CafeteraConFiltro extends CafeteraBase{

    private final Molinillo molinillo;

    public CafeteraConFiltro(String marca, String modelo, Molinillo molinillo) {
        super(marca, modelo,false,100,100);
        this.molinillo = molinillo;
    }
    @Override
    public TipoCafe hacerCafe() {
        molinillo.molerCafe();
        return this.tipoCafe;
    }
}
