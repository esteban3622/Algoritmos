/*
 * Crea un programa que solicite al usuario el monto total de su compra. 
 * Si el monto es mayor a $100, aplica un descuento del 15% y muestra el 
 * total final; de lo contrario, muestra el monto sin descuento.
 */

import java.util.Scanner;

public class SistemaDescuentosTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para almacenar los montos y descuentos
        Double montoCompra = 0.0;
        Double descuento15 = 0.0;
        Double totalConDescuento = 0.0;

        System.out.print("Ingrese el monto total de la compra: ");

        // Lee el valor del monto de compra ingresado por el usuario
        montoCompra = sc.nextDouble();
        sc.close();

        if (montoCompra > 100) {
            // Aplicamos un descuento del 15% si el monto supera los $100
            descuento15 = montoCompra * 0.15;
            totalConDescuento = montoCompra - descuento15;

            System.out.println("El monto total con el descuento es: " + totalConDescuento);
        } else {
            // Si no supera, el monto permanece igual
            System.out.println("El monto total sin cambios es: " + montoCompra);
        }
    }
}

// Aquí termina la clase DescuentoCon15
