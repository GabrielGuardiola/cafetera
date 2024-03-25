package com.gabodev.cafetera.model;

public class TipoCafeExpresso implements TipoCafe{
    @Override
    public void realizarCafe(Cafetera cafetera) {
        // Implementación específica para preparar un espresso
        if (!cafetera.isOn()) {
            System.out.println("La cafetera está apagada");
        } else {
            if (cafetera.getCafe() < 7) {
                System.out.println("No hay suficiente café para un espresso");
                return;
            }
            if (cafetera.getAgua() < 40) {
                System.out.println("No hay suficiente agua para un espresso");
                return;
            }
            cafetera.setCafe(cafetera.getCafe() - 7);
            cafetera.setAgua(cafetera.getAgua() - 40);
            System.out.println("Espresso hecho");
            System.out.println("Café restante: " + cafetera.getCafe() + "g");
            System.out.println("Agua restante: " + cafetera.getAgua() + "ml");
        }
    }
}
