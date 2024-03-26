package com.gabodev.cafetera.model;

public class Cafe {

    private String cafePreparado = "";
    private Boolean isFiltrado = false;

    public Cafe(String cafePreparado, Boolean isFiltrado){
        this.cafePreparado = cafePreparado;
        this.isFiltrado = isFiltrado;
    }

    public String getCafePreparado(){
        return this.cafePreparado;
    }

    public Boolean getIsFiltrado(){
        return this.isFiltrado;
    }
}
