package com.gabodev.cafetera;

import com.gabodev.cafetera.model.*;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Seleccione el tipo de cafetera:");
        System.out.println("1. Cafetera con filtro");
        System.out.println("2. Cafetera sin filtro");

        int tipoCafetera = scanner.nextInt();
        CafeteraBase cafetera;

        if (tipoCafetera == 1) {
            cafetera = new CafeteraConFiltro("Cafetera con filtro", "Modelo con filtro", new MolinilloCircular());
            cafetera.setTipoCafe(new TipoCafeNormal(true));
        } else if (tipoCafetera == 2) {
            cafetera = new CafeteraSinFiltro("Cafetera sin filtro", "Modelo sin filtro", new MolinilloConico());
            cafetera.setTipoCafe(new TipoCafeExpresso(false));

        } else {
            System.out.println("Tipo de cafetera inválido");
            return;
        }

        boolean isRunning = true;

        while(isRunning){
            System.out.println("------------------------------");
            System.out.println("Que desea hacer?");
            System.out.println("1. Encender cafetera");
            System.out.println("2. Apagar cafetera");
            System.out.println("3. Rellenar agua");
            System.out.println("4. Rellenar café");
            System.out.println("5. Preparar café ristretto");
            System.out.println("6. Preparar café espresso");
            System.out.println("7. Preparar café normal");
            System.out.println("8. Salir");
            System.out.println("------------------------------");

            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    cafetera.encender();
                    break;
                case 2:
                    cafetera.apagar();
                    break;
                case 3:
                    System.out.println("Cuanta agua desea rellenar?");
                    int cantidadAgua = scanner.nextInt();
                    cafetera.rellenarAgua(cantidadAgua);
                    break;
                case 4:
                    System.out.println("Cuanto café desea rellenar?");
                    int cantidadCafe = scanner.nextInt();
                    cafetera.rellenarCafe(cantidadCafe);
                    break;
                case 5:
                    cafetera.setTipoCafe(new TipoCafeRistretto(tipoCafetera == 1));
                    TipoCafe cafeRistretto = cafetera.hacerCafe();
                    System.out.println("Se ha preparado un café: " + cafeRistretto.getTipo());
                    System.out.println("Filtrado: " + cafeRistretto.getIsFiltered());
                    break;
                case 6:
                    cafetera.setTipoCafe(new TipoCafeExpresso(tipoCafetera == 1));
                    TipoCafe cafeExpresso = cafetera.hacerCafe();
                    System.out.println("Se ha preparado un café: " + cafeExpresso.getTipo());
                    System.out.println("Filtrado: " + cafeExpresso.getIsFiltered());
                    break;
                case 7:
                    cafetera.setTipoCafe(new TipoCafeNormal(tipoCafetera == 1));
                    TipoCafe cafeNormal = cafetera.hacerCafe();
                    System.out.println("Se ha preparado un café: " + cafeNormal.getTipo());
                    System.out.println("Filtrado: " + cafeNormal.getIsFiltered());
                    break;
                case 8:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}