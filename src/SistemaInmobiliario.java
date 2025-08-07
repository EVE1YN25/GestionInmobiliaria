import java.util.ArrayList;
import java.util.Scanner;

// Código de la clase SistemaInmobiliario
public class SistemaInmobiliario {
    private static ArrayList<Inmueble> listaInmuebles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcion;
        do {
            System.out.println("\n--- Menú Sistema Inmobiliario ---");
            System.out.println("1. Agregar Inmueble");
            System.out.println("2. Visualizar todos los Inmuebles");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarInmueble();
                    break;
                case 2:
                    visualizarInmuebles();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    public static void agregarInmueble() {
        System.out.println("\n--- Agregar Nuevo Inmueble ---");
        System.out.println("1. Agregar Casa");
        System.out.println("2. Agregar Departamento");
        System.out.println("3. Agregar Terreno");
        System.out.print("Seleccione el tipo de inmueble: ");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese área (m²): ");
        int area = scanner.nextInt();
        System.out.print("Está disponible (true/false): ");
        boolean disponible = scanner.nextBoolean();

        switch (tipo) {
            case 1:
                System.out.print("Ingrese número de pisos: ");
                int numPisos = scanner.nextInt();
                System.out.print("Tiene patio (true/false): ");
                boolean tienePatio = scanner.nextBoolean();
                listaInmuebles.add(new Casa(direccion, ciudad, precio, area, disponible, numPisos, tienePatio));
                break;
            case 2:
                System.out.print("Ingrese piso: ");
                int piso = scanner.nextInt();
                System.out.print("Tiene ascensor (true/false): ");
                boolean tieneAscensor = scanner.nextBoolean();
                listaInmuebles.add(new Departamento(direccion, ciudad, precio, area, disponible, piso, tieneAscensor));
                break;
            case 3:
                System.out.print("Ingrese tipo de suelo: ");
                String tipoSuelo = scanner.next();
                System.out.print("Tiene servicios básicos (true/false): ");
                boolean tieneServiciosBasicos = scanner.nextBoolean();
                listaInmuebles.add(new Terreno(direccion, ciudad, precio, area, disponible, tipoSuelo, tieneServiciosBasicos));
                break;
            default:
                System.out.println("Tipo de inmueble no válido.");
        }
        System.out.println("¡Inmueble agregado con éxito!");
    }

    public static void visualizarInmuebles() {
        if (listaInmuebles.isEmpty()) {
            System.out.println("\nNo hay inmuebles registrados.");
            return;
        }
        System.out.println("\n--- Lista de Inmuebles Registrados ---");
        for (Inmueble i : listaInmuebles) {
            i.mostrarInformacion();
        }
    }
}
