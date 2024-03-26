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
            cafetera = new CafeteraConFiltro("Cafetera con filtro", "Modelo con filtro");
        } else if (tipoCafetera == 2) {
            cafetera = new CafeteraSinFiltro("Cafetera sin filtro", "Modelo sin filtro");
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
            System.out.println("5. Hacer café");
            System.out.println("6. Preparar café ristretto");
            System.out.println("7. Preparar café espresso");
            System.out.println("8. Preparar café normal");
            System.out.println("9. Salir");
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
                    Cafe cafe = cafetera.hacerCafe(new TipoCafeNormal());
                    System.out.println("Se ha preparado un café: " + cafe.getCafePreparado());
                    System.out.println("Filtrado: " + cafe.getIsFiltrado());
                    break;
                case 6:
                    Cafe cafeRistretto = cafetera.hacerCafe(new TipoCafeRistretto());
                    System.out.println("Se ha preparado un café: " + cafeRistretto.getCafePreparado());
                    System.out.println("Filtrado: " + cafeRistretto.getIsFiltrado());
                    break;
                case 7:
                    Cafe cafeExpresso = cafetera.hacerCafe(new TipoCafeExpresso());
                    System.out.println("Se ha preparado un café: " + cafeExpresso.getCafePreparado());
                    System.out.println("Filtrado: " + cafeExpresso.getIsFiltrado());
                    break;
                case 8:
                    Cafe cafeNormal = cafetera.hacerCafe(new TipoCafeNormal());
                    System.out.println("Se ha preparado un café: " + cafeNormal.getCafePreparado());
                    System.out.println("Filtrado: " + cafeNormal.getIsFiltrado());
                    break;
                case 9:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}