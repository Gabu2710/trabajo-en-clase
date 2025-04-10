import java.util.LinkedList;
import java.util.Scanner;




import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>();
        int option;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Eliminar nombre");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("Ingresa un nombre: ");
                    String name = scanner.nextLine();
                    cola.add(name); // Agrega al final de la cola
                    break;
                case 2:
                    String removed = cola.poll(); // Elimina y devuelve el frente
                    if (removed == null) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("Nombre eliminado: " + removed);
                    }
                    break;
                case 3:
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("Contenido de la cola:");
                        for (String n : cola) {
                            System.out.println(n);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (option != 4);

        scanner.close();
    }
}

