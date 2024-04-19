import java.util.Random;
import java.util.Scanner;

public class equacao1grau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número minimo");
        int min = scanner.nextInt();
        System.out.println("Digite o número máximo");
        int max = scanner.nextInt();
        Random random = new Random();

        System.out.println(random);

        scanner.close();
    }

}