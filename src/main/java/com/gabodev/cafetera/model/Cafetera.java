package com.gabodev.cafetera.model;

public class Cafetera {

    private TipoCafe tipoCafe;
    private String marca;
    private String modelo;
    private boolean isOn;
    private final int MAX_AGUA = 100;
    private final int MAX_CAFE = 100;

    private int agua;
    private int cafe;

    public Cafetera(String marca, String modelo) {
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

    public void realizarCafe() {
        tipoCafe.realizarCafe(this);
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

    public void hacerCafe() {
        if(!isOn) {
            System.out.println("La cafetera está apagada");
        } else{
            if(cafe < 10) {
                System.out.println("No hay suficiente café");
                return;
            }
            if(agua < 50) {
                System.out.println("No hay suficiente agua");
                return;
            }
            cafe = cafe - 10;
            agua = agua - 50;
            System.out.println("Café hecho");
            System.out.println("Café restante: " + cafe + "g");
            System.out.println("Agua restante: " + agua + "ml");
        }
    }

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
