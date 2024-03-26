package com.gabodev.cafetera.model;

public class TipoCafeRistretto implements TipoCafe{

    private String tipo = "Ristretto";
    private Boolean isFiltered = false;

    public TipoCafeRistretto (){

    }

    public TipoCafeRistretto(Boolean isFiltered){
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
