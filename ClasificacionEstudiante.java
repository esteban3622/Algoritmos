import java.util.Scanner;

public class ClasificacionEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la nota al usuario
        System.out.print("Ingrese la nota del estudiante (0 - 100): ");
        int nota = scanner.nextInt();

        // Evaluación con condicionales anidados
        if (nota >= 90) {
            System.out.println("Clasificación: Excelente");
        } else {
            if (nota >= 80) {
                System.out.println("Clasificación: Muy bueno");
            } else {
                if (nota >= 70) {
                    System.out.println("Clasificación: Bueno");
                } else {
                    if (nota >= 60) {
                        System.out.println("Clasificación: Suficiente");
                    } else {
                        System.out.println("Clasificación: Reprobado");
                    }
                }
            }
        }

        scanner.close();
    }
}
