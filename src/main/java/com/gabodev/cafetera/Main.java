package com.gabodev.cafetera;

import com.gabodev.cafetera.model.Cafetera;
import com.gabodev.cafetera.model.TipoCafeExpresso;
import com.gabodev.cafetera.model.TipoCafeRistretto;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera("Cafetera de la abuela", "Abuelinetor-300");

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
                    cafetera.hacerCafe();
                    break;
                case 6:
                    cafetera.setTipoCafe(new TipoCafeRistretto());
                    cafetera.realizarCafe();
                    break;
                case 7:
                    cafetera.setTipoCafe(new TipoCafeExpresso());
                    cafetera.realizarCafe();
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