package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de la compra:");

        double cantidadCompra = scanner.nextDouble();

        int puntosAcumulados = (int) cantidadCompra / 10;

        System.out.println("Puntos acumulados: " + puntosAcumulados);
    

        String nivelFidelizacion;

        if (puntosAcumulados >1001) {
            nivelFidelizacion = "Platino";
            
        } else if (puntosAcumulados >=501) {
            nivelFidelizacion = "Oro";
            
        }else if (puntosAcumulados >= 101 ) {
            nivelFidelizacion = "Plata";
            
        }else 
            nivelFidelizacion = "Bronce";
            
        
        System.out.println("Nivel de fidelizacion: " + nivelFidelizacion );

        if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals("Platino")) {
            System.out.println("!Felicidades¡ Obtuviste un 10% de descuento.");
        }
        if (nivelFidelizacion.equals("Platino")) {
            System.out.println("!Tambien te ortorgamos un cupon para un producto de la canasta familiar¡ ");
            
        }

        scanner.close();



    }
}