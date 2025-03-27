import java.util.Scanner;

public class CalculadoraDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int OpcUser = 0, numA = 0, numB = 0;
        boolean Key = true;

        do{
            System.out.println("1. Sumar dos números\r\n" + //
                    "2. Restar dos números\r\n" + //
                    "3. Multiplicar dos números\r\n" + //
                    "4. Dividir dos números\r\n" + //
                    "5. Salir\r\n");
            System.out.print("Opción seleccionada: ");
            OpcUser = scanner.nextInt();

            switch (OpcUser) {
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
                    Key = false;
                    break;

                default:
                    System.out.println("Opción no valida!");
                    break;
            }
        }while(Key);

        scanner.close();

    }
}

