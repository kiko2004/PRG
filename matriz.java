
import java.util.Random;

public class matriz {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][8];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9);

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}