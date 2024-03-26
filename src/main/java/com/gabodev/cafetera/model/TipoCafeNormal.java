package com.gabodev.cafetera.model;

public class TipoCafeNormal implements TipoCafe {

    private String tipo = "Normal";

    private Boolean isFiltered = false;

    public TipoCafeNormal (){

    }

    public TipoCafeNormal(Boolean isFiltered){
        this.isFiltered = isFiltered;
    }

    public String getTipo(){
        return  tipo;
    }

    @Override
    public Boolean getIsFiltered() {
        return isFiltered;
    }
}
