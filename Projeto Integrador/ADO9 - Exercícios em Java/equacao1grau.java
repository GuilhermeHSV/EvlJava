import java.util.Random;
import java.util.Scanner;

public class equacao1grau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor mínimo:");
        int min = scanner.nextInt();

        System.out.println("Digite o valor máximo:");
        int max = scanner.nextInt();

        Random random = new Random();

        // Gerando os coeficientes 'a' e 'b' aleatoriamente no intervalo [min, max]
        int a = random.nextInt((max - min) + 1) + min;
        int b = random.nextInt((max - min) + 1) + min;

        // Exibindo a equação ax + b = 0
        System.out.println("A equação é: " + a + "x + " + b + " = 0");

        // Calculando a solução da equação
        double solucao = -b / (double) a;

        // Exibindo a solução
        System.out.printf("A solução da equação é x = %.2f", solucao);

        scanner.close();
    }
}
