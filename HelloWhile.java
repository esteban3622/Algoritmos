import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Bienvenidos");
        int contador = 1;
        int tablaMultiplicar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número ");
        tablaMultiplicar = scanner.nextInt();


        while(contador <= 1000){
            System.out.println(contador + " x " + tablaMultiplicar + " = " + tablaMultiplicar*contador);
            contador++;
        }

        scanner.close();
    }
   
}