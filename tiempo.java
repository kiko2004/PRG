import java.util.Scanner;

public class tiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero de segundos");
        int segundosIniciales = scanner.nextInt();

        int horas = segundosIniciales / 3600;
        int minutos = (segundosIniciales % 3600) / 60;
        int segundos = segundosIniciales % 60;

        System.out.println("son" + horas + "horas" + minutos + "minutos" + segundos + "segundos");
    }
}
