/*
 * Desarrolla un programa que solicite al usuario su nombre y contraseña. 
 * Si el nombre de usuario es "admin" y la contraseña es "1234", se 
 * mostrará el mensaje "Acceso permitido". De lo contrario, se 
 * mostrará "Acceso denegado".
 */

import java.util.Scanner;

public class VerificacionAccesoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = "";
        String password = "";
        System.out.println(username == password);

        System.out.print("Ingrese usuario: ");

        username = sc.nextLine();

        System.out.print("Ingrese contraseña: ");

        password = sc.nextLine();

        if ((username.equals("admin")) && (password.equals("1234"))) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        sc.close();
    }
}
