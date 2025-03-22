/*
 * Estás desarrollando una pequeña calculadora que permita al usuario realizar 
 * varias operaciones matemáticas simples (suma, resta, multiplicación y división). 
 * El programa debe mostrar un menú de opciones y permitir al usuario realizar tantas 
 * operaciones como desee. El programa solo debe finalizar cuando el usuario seleccione 
 * la opción de salir.
 */

import java.util.Scanner;

public class CalculadorWhile {
    public static void main(String[] args) {
        int numA = 0, numB = 0;
        int varControl = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos");

        while (varControl != 5) {
            System.out.println("1. Sumar dos números\r\n" + //
                    "2. Restar dos números\r\n" + //
                    "3. Multiplicar dos números\r\n" + //
                    "4. Dividir dos números\r\n" + //
                    "5. Salir\r\n");
            System.out.print("Opción seleccionada: ");
            varControl = scanner.nextInt();

            switch (varControl) {
                case 1:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " + " + numB + " = " + (numA + numB));

                    break;
                case 2:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " - " + numB + " = " + (numA - numB));

                    break;
                case 3:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " * " + numB + " = " + (numA * numB));

                    break;
                case 4:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " / " + numB + " = " + (numA / numB));

                    break;
                case 5:
                    System.out.println("Gracias, hasta pronto!");

                    break;

                default:
                    System.out.println("Opción no valida!");
                    break;
            }

        }

        scanner.close();
    }
}
