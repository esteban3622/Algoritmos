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

public class VerificacionPalindromosNumericos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresaUsuario = 0;
        int resultadoResiduo = 0;
        int resultadoDivisionEntera = 0; 
        int copiaNumeroIngresado = 0;
        int numeroAComparar = 0;
        int contador = 0;
        boolean key = true;


        System.out.print("Por favor ingrese un número entero positivo: ");
        numeroIngresaUsuario = scanner.nextInt();
        // contador = numeroIngresaUsuario.length();
        copiaNumeroIngresado = numeroIngresaUsuario; 
        while(key){
            resultadoResiduo = copiaNumeroIngresado % 10;
            resultadoDivisionEntera = copiaNumeroIngresado / 10;
            copiaNumeroIngresado = resultadoDivisionEntera;
            contador++;
            if(copiaNumeroIngresado > 9){
                key = true;
            }else{
                key = false;
            }
            
        }
        key = true;
        System.out.println("contador = " +contador);
        copiaNumeroIngresado = numeroIngresaUsuario;
        while(key){
            resultadoResiduo = copiaNumeroIngresado % 10;
            numeroAComparar = numeroAComparar + resultadoResiduo*((int)Math.pow(10, contador));
            resultadoDivisionEntera = copiaNumeroIngresado / 10;
            copiaNumeroIngresado = resultadoDivisionEntera;
            contador--;
            if(copiaNumeroIngresado > 9){
                key = true;
            }else{
                key = false;
                numeroAComparar = numeroAComparar + copiaNumeroIngresado*(int)Math.pow(10, contador);
            }
            
        }

        System.out.println("numero a comparar "+ numeroAComparar);
        if(numeroIngresaUsuario == numeroAComparar){
            System.out.println("El número " + numeroIngresaUsuario + " es un palíndromo.");
        }else{
            System.out.println("El número " + numeroIngresaUsuario + " no es un palíndromo.");
        }

        scanner.close();
    }
}
