import java.util.Scanner;

public class segundoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro N: ");
        int n = scanner.nextInt();

        System.out.println("Os 3 primeiros múltiplos de " + n + " são:");
        for (int i = 1; i <= 3; i++) {
            int multiplo = n * i;
            System.out.println("Múltiplo " + i + ": " + multiplo);
        }

        scanner.close();
    }
}
