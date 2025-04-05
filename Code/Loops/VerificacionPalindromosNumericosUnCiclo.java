/*
 * Enunciado:
 * Solicita un número entero positivo. Usando operaciones 
 * aritméticas y un ciclo, determina si ese número es un 
 * palíndromo (se lee igual de izquierda a derecha y de 
 * derecha a izquierda).
 * 
 * Ejemplo:
 * 121 → es palíndromo
 * 123 → no lo es
 * 
 * Temas aplicados:
 * Ciclos (while)
 * Condicionales
 * Aritmética (%, /)
 * No usa Strings
 */

import java.util.Scanner;

public class VerificacionPalindromosNumericosUnCiclo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresaUsuario = 0, temporal = 0, temporal2 = 0, temporal3 = 0, numeroAComparar = 0, contador = 0;
        boolean key = true;

        System.out.print("Por favor ingrese un número entero positivo: ");
        numeroIngresaUsuario = scanner.nextInt();
        contador = (int) (Math.log10(numeroIngresaUsuario));
        // System.out.println("contador = " +contador);
        temporal3 = numeroIngresaUsuario;
        while (key) {
            temporal = temporal3 % 10;
            numeroAComparar = numeroAComparar + temporal * ((int) Math.pow(10, contador));
            temporal2 = temporal3 / 10;
            temporal3 = temporal2;
            contador--;
            if (temporal3 > 9) {
                key = true;
            } else {
                key = false;
                numeroAComparar = numeroAComparar + temporal3 * (int) Math.pow(10, contador);
            }

        }

        System.out.println("numero a comparar " + numeroAComparar);
        if (numeroIngresaUsuario == numeroAComparar) {
            System.out.println("El número " + numeroIngresaUsuario + " es un palíndromo.");
        } else {
            System.out.println("El número " + numeroIngresaUsuario + " no es un palíndromo.");
        }

        scanner.close();
    }
}
