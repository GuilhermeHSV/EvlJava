package AlgoritmosProgramação.ADO4;

/*
 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X. Use o laço for
 */
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num = scanner.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
