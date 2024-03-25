package com.gabodev.cafetera.model;

public class TipoCafeNormal implements TipoCafe {

    @Override
    public void realizarCafe(Cafetera cafetera) {
        cafetera.hacerCafe();
    }
}
