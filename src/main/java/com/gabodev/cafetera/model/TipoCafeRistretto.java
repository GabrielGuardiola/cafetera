package com.gabodev.cafetera.model;

public class TipoCafeRistretto implements TipoCafe{
    @Override
    public void realizarCafe(Cafetera cafetera) {
        // Implementación específica para preparar un ristretto
        if (!cafetera.isOn()) {
            System.out.println("La cafetera está apagada");
        } else {
            if (cafetera.getCafe() < 5) {
                System.out.println("No hay suficiente café para un ristretto");
                return;
            }
            if (cafetera.getAgua() < 30) {
                System.out.println("No hay suficiente agua para un ristretto");
                return;
            }
            cafetera.setCafe(cafetera.getCafe() - 5);
            cafetera.setAgua(cafetera.getAgua() - 30);
            System.out.println("Ristretto hecho");
            System.out.println("Café restante: " + cafetera.getCafe() + "g");
            System.out.println("Agua restante: " + cafetera.getAgua() + "ml");
        }
    }
}
