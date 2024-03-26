package com.gabodev.cafetera.model;

public class TipoCafeExpresso implements TipoCafe{

    private String tipo = "Expresso";
    private Boolean isFiltered = false;

    public TipoCafeExpresso (){

    }

    public TipoCafeExpresso(Boolean isFiltered){
        this.isFiltered = isFiltered;
    }

    public String getTipo(){
        return this.tipo;
    }

    @Override
    public Boolean getIsFiltered() {
        return isFiltered;
    }
}
