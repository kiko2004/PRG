import java.util.Scanner;

public class CineEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();

        if (edad <= 5){
        System.out.println("tu entrada es gratuita");
        }else if (edad > 5 && edad < 10){
        System.out.println("tu entrada son 3euros");
        }else if (edad >= 10 && edad < 18){
        System.out.println("tu entrada son 5euros");
        }else if (edad >= 18){
        System.out.println("tu entrada son 7euros");
    }
    }
}
