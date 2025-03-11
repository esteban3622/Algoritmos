import java.util.Scanner; // Importar la clase Scanner para leer la entrada del usuario

public class MenuRestauranteIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Menú de Almuerzo:");
        System.out.println("1. Hamburguesa");
        System.out.println("2. Ensalada César");
        System.out.println("3. Pasta Alfredo");
        System.out.println("4. Sándwich Club");
        System.out.println("5. Pizza Margherita");

        // Pedir al usuario que elija un plato
        System.out.print("Por favor, elige un número del menú: ");
        int eleccion = scanner.nextInt(); // Leer la entrada entera

        // Utilizar una estructura if para procesar la elección del usuario
        if (eleccion == 1) {
            System.out.println("Has seleccionado: Hamburguesa");
        } else if (eleccion == 2) {
            System.out.println("Has seleccionado: Ensalada César");
        } else if (eleccion == 3) {
            System.out.println("Has seleccionado: Pasta Alfredo");
        } else if (eleccion == 4) {
            System.out.println("Has seleccionado: Sándwich Club");
        } else if (eleccion == 5) {
            System.out.println("Has seleccionado: Pizza Margherita");
        } else {
            System.out.println("Entrada no válida. Por favor, elige un número entre 1 y 5.");
        }

        scanner.close(); // Cerrar el objeto Scanner
    }

}
