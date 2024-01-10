import java.util.Scanner;

public class Operacionesbasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce un precio");
        double precioInicial = scanner.nextDouble();
        System.out.println("introduce un porcentaje de descuento");
        double porcentajeDescuento = scanner.nextDouble();
        double descuento = precioInicial * (porcentajeDescuento / 100);
        double precioFinal = precioInicial - descuento;

        System.out.println(precioFinal);
    }
}
