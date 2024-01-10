import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int numeroInicial = scanner.nextInt();

        double numeroFinal = (double) numeroInicial * 2;

        System.out.println(numeroFinal);
    }
}
