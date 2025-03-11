import java.util.Scanner;

public class MenuRestauranteSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int opcion = 0;

        System.out.println("Bienvenido al Menú de Almuerzo:");
        System.out.println("1. Hamburguesa");
        System.out.println("2. Ensalada César");
        System.out.println("3. Pasta Alfredo");
        System.out.println("4. Sándwich Club");
        System.out.println("5. Pizza Margherita");

        System.out.print("Seleccione un item del menú (1-5): ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Hamburguesa seleccionada.");
                break;
            case 2:
                System.out.println("Ensalada César seleccionada.");
                break;
            case 3:
                System.out.println("Pasta Alfredo seleccionada.");
                break;
            case 4:
                System.out.println("Sándwich Club seleccionado.");
                break;
            case 5:
                System.out.println("Pizza Margherita seleccionada.");
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
        scanner.close();
    }
}
