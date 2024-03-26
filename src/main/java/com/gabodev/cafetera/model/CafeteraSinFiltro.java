package com.gabodev.cafetera.model;

public class CafeteraSinFiltro extends CafeteraBase{

    private final Molinillo molinillo;

    public CafeteraSinFiltro(String marca, String modelo, Molinillo molinillo) {
        super(marca, modelo,false,100,100);
        this.molinillo = molinillo;
    }
    @Override
    public TipoCafe hacerCafe() {
        molinillo.molerCafe();
        return this.tipoCafe;
    }
}
