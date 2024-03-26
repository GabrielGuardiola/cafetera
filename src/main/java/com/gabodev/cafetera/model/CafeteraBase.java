package com.gabodev.cafetera.model;

public abstract class CafeteraBase {

    protected TipoCafe tipoCafe;
    protected String marca;
    protected String modelo;
    protected boolean isOn;
    protected final int MAX_AGUA = 100;
    protected final int MAX_CAFE = 100;

    protected int agua;
    protected int cafe;

    public CafeteraBase(String marca, String modelo, boolean isOn, int agua, int cafe) {
        this.marca = marca;
        this.modelo = modelo;
        this.isOn = false;
        this.agua = 0;
        this.cafe = 0;
        this.tipoCafe = new TipoCafeNormal();
    }

    public void setTipoCafe(TipoCafe tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public int getAgua() {
        return agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void encender() {
        if(!isOn) {
            isOn = true;
            System.out.println("Cafetera encendida");
        } else {
            System.out.println("La cafetera ya está encendida");
        }
    }

    public void apagar() {
        if(isOn) {
            isOn = false;
            System.out.println("Cafetera apagada");
        } else {
            System.out.println("La cafetera ya está apagada");
        }
    }
    public void rellenarAgua(int cantidad) {
        if(cantidad > 0) {
            if(agua + cantidad <= MAX_AGUA) {
                agua += cantidad;
                System.out.println("Se ha rellenado " + cantidad + "ml de agua");
            } else {
                System.out.println("No se puede rellenar más agua");
            }
        } else {
            System.out.println("La cantidad de agua a rellenar debe ser mayor a 0");
        }
    }

    public void rellenarCafe(int cantidad) {
        if(cantidad > 0) {
            if(cafe + cantidad <= MAX_CAFE) {
                cafe += cantidad;
                System.out.println("Se ha rellenado " + cantidad + "g de café");
            } else {
                System.out.println("No se puede rellenar más café");
            }
        } else {
            System.out.println("La cantidad de café a rellenar debe ser mayor a 0");
        }
    }

    public abstract TipoCafe hacerCafe();
    public boolean isOn() {
        return isOn;
    }

    public void setCafe(int cantidad) {
        this.cafe = cantidad;
    }

    public void setAgua(int cantidad) {
        this.agua = cantidad;
    }
}
