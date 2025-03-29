/*
 * Crear un juego que genere un número aleatorio entre 1 y 20. 
 * El usuario debe adivinarlo. El programa indica si el número 
 * ingresado es mayor o menor al número oculto. El juego termina 
 * cuando el usuario acierta, mostrando cuántos intentos le tomó.
 */

import java.util.Scanner;

public class JuegoAdivinarNumero {
 
    public static void main(String[] args) {
        int numeroAleatorio = 0;
        int numeroUsuario = 0;
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);
        
        /* Verificar el número aleatorio */
        do{
            numeroAleatorio = (int) (Math.random()*20); // Inicializa el generador de números aleatorios
        }while(numeroAleatorio > 20 || numeroAleatorio < 1); // Verifica que el número esté entre 1 y 20
        
        System.out.println(numeroAleatorio);
        
        /* Inicia el juego */
        System.out.println("Bienvenido al juego de adivinar el número!");
        do{
            intentos++; // Incrementa el número de intentos
            System.out.print("Adivina el número entre 1 y 20: ");
            numeroUsuario = scanner.nextInt(); // Lee el número ingresado por el usuario
            /* 
            if (numeroAleatorio != numeroUsuario) {
                if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El número ingresado es mayor al número oculto.");
                    System.out.println("No haz adivinado el número, intenta nuevamente.");
                } else {
                    System.out.println("El número ingresado es menor al número oculto.");
                    System.out.println("No haz adivinado el número, intenta nuevamente.");
                } 
            }
            */
            if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número ingresado es mayor al número oculto.");
                System.out.println("No haz adivinado el número, intenta nuevamente.");
            } else if (numeroUsuario < numeroAleatorio){
                System.out.println("El número ingresado es menor al número oculto.");
                System.out.println("No haz adivinado el número, intenta nuevamente.");
            } else {
                System.out.println("Felicitaciones haz adivinado el número oculto!");
                System.out.println("Te tomó " + intentos + " intentos adivinar el número oculto.");
            } 
        }while(numeroUsuario != numeroAleatorio); // Verifica si el número ingresado es igual al número oculto

        scanner.close(); // Cierra el escáner
    }
 }