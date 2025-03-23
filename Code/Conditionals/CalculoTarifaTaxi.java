/*
 * Una compañía de taxis necesita calcular la tarifa de un viaje 
 * según la distancia recorrida y si el servicio se realizó en 
 * horario nocturno.
 * 
 * Requisitos del programa:
 * - La tarifa base es de $2.50.
 * - Por cada kilómetro recorrido hasta los 10 km, se cobra $1.00.
 * - Por cada kilómetro adicional (más de 10 km), se cobra $0.75.
 * - Si el servicio se realizó en horario nocturno, se añade un 
 * recargo del 10% sobre la tarifa calculada.
 * 
 * El programa debe solicitar la distancia en kilómetros y si 
 * el viaje fue nocturno ("S" para sí, "N" para no), calcular 
 * la tarifa total y mostrarla.
 */

import java.util.Scanner;

public class CalculoTarifaTaxi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tarifaDiaNoche = "";
        double distancia = 0.0;
        double totalPasaje = 0.0;
        final double tarifaBase = 2.50;
        final double kilometroNormal = 1.00;
        final double kilometroAdicional = 0.75;

        System.out.print("Ingrese la distancia total recorrida: ");
        distancia = sc.nextDouble();

        System.out.print("El servicio fue Día (S) / Noche (N) ");
        tarifaDiaNoche = sc.next();

        if (distancia < 10) {
            totalPasaje = distancia * kilometroNormal + tarifaBase;
        } else {
            totalPasaje = 10 * kilometroNormal + (distancia - 10) * kilometroAdicional + tarifaBase;
        }

        if (tarifaDiaNoche.equals("N")) {
            totalPasaje = totalPasaje * 1.1;
        }

        System.out.println("La tarifa total es: " + totalPasaje);
        sc.close();
    }
}