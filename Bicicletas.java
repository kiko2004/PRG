import java.util.ArrayList;
import java.util.Scanner;

class Bicicleta {
    String referencia;
    String marca;
    String modelo;
    double peso;
    double tamanoRuedas;
    boolean tieneMotor;
    String fechaFabricacion;
    double precio;
    int existencias;

    public Bicicleta(String referencia, String marca, String modelo, double peso,
                     double tamanoRuedas, boolean tieneMotor, String fechaFabricacion,
                     double precio, int existencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.tamanoRuedas = tamanoRuedas;
        this.tieneMotor = tieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.existencias = existencias;
    }

    public void mostrarInformacion() {
        System.out.println("Referencia: " + referencia);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Tamaño de ruedas: " + tamanoRuedas + " pulgadas");
        System.out.println("Tiene motor: " + (tieneMotor ? "Sí" : "No"));
        System.out.println("Fecha de fabricación: " + fechaFabricacion);
        System.out.println("Precio: " + precio + " euros");
        System.out.println("Existencias: " + existencias);
    }
}

public class Bicicletas {

    public static ArrayList<Bicicleta> stockBicicletas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        stockBicicletas.add(new Bicicleta("001", "Marca1", "Modelo1", 12.5, 26, false, "01/01/2023", 300.0, 10));
        stockBicicletas.add(new Bicicleta("002", "Marca2", "Modelo2", 14.2, 29, true, "02/02/2023", 500.0, 5));

        int opcion;
        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    anadirBicicleta();
                    break;
                case 2:
                    venderBicicleta();
                    break;
                case 3:
                    consultarBicicleta();
                    break;
                case 4:
                    mostrarStock();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("*************************");
        System.out.println("** GESTIÓN DE BICICLETAS **");
        System.out.println("*************************");
        System.out.println("1.- Añadir bicicleta");
        System.out.println("2.- Vender bicicleta");
        System.out.println("3.- Consultar bicicleta");
        System.out.println("4.- Mostrar stock");
        System.out.println("------------------------------------");
        System.out.println("0.- Salir");
    }

    public static void anadirBicicleta() {
        System.out.println("Introduce los datos de la bicicleta:");
        System.out.print("Referencia: ");
        String referencia = scanner.nextLine();

        for (Bicicleta bicicleta : stockBicicletas) {
            if (bicicleta.referencia.equals(referencia)) {
                System.out.println("La bicicleta ya existe en el stock. Incrementando existencias.");
                bicicleta.existencias++;
                return;
            }
        }

        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Peso en Kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Tamaño de ruedas en pulgadas: ");
        double tamanoRuedas = scanner.nextDouble();
        System.out.print("¿Tiene motor? (true/false): ");
        boolean tieneMotor = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Fecha de fabricación: ");
        String fechaFabricacion = scanner.nextLine();
        System.out.print("Precio en euros: ");
        double precio = scanner.nextDouble();
        System.out.print("Número de existencias: ");
        int existencias = scanner.nextInt();

        stockBicicletas.add(new Bicicleta(referencia, marca, modelo, peso, tamanoRuedas,
                tieneMotor, fechaFabricacion, precio, existencias));

        System.out.println("Bicicleta añadida correctamente al stock.");
    }

    public static void venderBicicleta() {
        System.out.print("Introduce la referencia de la bicicleta que quieres vender: ");
        String referencia = scanner.nextLine();

        for (Bicicleta bicicleta : stockBicicletas) {
            if (bicicleta.referencia.equals(referencia)) {
                if (bicicleta.existencias > 0) {
                    System.out.println("Bicicleta " + referencia + " vendida correctamente.");
                    bicicleta.existencias--;
                } else {
                    System.out.println("No hay existencias de la bicicleta " + referencia + ".");
                }
                return;
            }
        }

        System.out.println("No se encontró ninguna bicicleta con la referencia " + referencia + ".");
    }

    public static void consultarBicicleta() {
        int opcion;
        do {
            mostrarSubMenuConsulta();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    consultarPorReferencia();
                    break;
                case 2:
                    consultarPorMarca();
                    break;
                case 3:
                    consultarPorModelo();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 0);
    }

    public static void mostrarSubMenuConsulta() {
        System.out.println("***********************");
        System.out.println("** CONSULTA BICICLETA **");
        System.out.println("***********************");
        System.out.println("1.- Consultar por referencia");
        System.out.println("2.- Consultar por marca");
        System.out.println("3.- Consultar por modelo");
        System.out.println("--------------------------------");
        System.out.println("0.- Volver al menú principal");
    }

    public static void consultarPorReferencia() {
        System.out.print("Introduce la referencia de la bicicleta: ");
        String referencia = scanner.nextLine();

        for (Bicicleta bicicleta : stockBicicletas) {
            if (bicicleta.referencia.equals(referencia)) {
                bicicleta.mostrarInformacion();
                return;
            }
        }

        System.out.println("No se encontró ninguna bicicleta con la referencia " + referencia + ".");
    }

    public static void consultarPorMarca() {
        System.out.print("Introduce la marca de las bicicletas a consultar: ");
        String marca = scanner.nextLine();

        for (Bicicleta bicicleta : stockBicicletas) {
            if (bicicleta.marca.equals(marca)) {
                bicicleta.mostrarInformacion();
                System.out.println("-----------------------------");
            }
        }
    }

    public static void consultarPorModelo() {
        System.out.print("Introduce el modelo de las bicicletas a consultar: ");
        String modelo = scanner.nextLine();

        for (Bicicleta bicicleta : stockBicicletas) {
            if (bicicleta.modelo.equals(modelo)) {
                bicicleta.mostrarInformacion();
                System.out.println("-----------------------------");
            }
        }
    }

    public static void mostrarStock() {
        for (Bicicleta bicicleta : stockBicicletas) {
            bicicleta.mostrarInformacion();
            System.out.println("-----------------------------");
        }
    }
}
