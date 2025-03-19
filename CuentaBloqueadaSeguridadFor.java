import java.util.Scanner;

public class CuentaBloqueadaSeguridadFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contrasena_verdadera = 1234;
        int contrasena_ingresada = 0;

        for (int contador = 2; contador >= 0; contador--) {     
            System.out.print("Ingrese su contraseña: ");
            contrasena_ingresada = scanner.nextInt();
            
            if (contrasena_ingresada == contrasena_verdadera){
                System.out.println("Acceso permitido.");
                contador = -1;
            } else {
                System.out.println("Contraseña incorrecta. Intentos restantes: " + contador);
            }
            if (contador == 0){
                System.out.println("Cuenta bloqueada por seguridad.");
            } 
        }
        
    }
}