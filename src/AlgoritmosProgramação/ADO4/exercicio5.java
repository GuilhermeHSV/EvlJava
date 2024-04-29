package AlgoritmosProgramação.ADO4;

/*
 * Leia um valor inteiro N do usuário, onde N é maior ou igual a 2 e menor ou igual a
1000.
A seguir, usando o laço DO-WHILE, mostre a tabuada de N no seguinte formato:
1 x N = N 2 x N = 2N ... 10 x N = 10N
 */
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i = 1, multi = 0;
        System.out.println("Digite um número");
        num = scanner.nextInt();
        if (num >= 2 && num <= 1000) {
            do {
                multi = i * num;
                System.out.println(i + "x" + num + "=" + multi);
                i++;
            } while (i <= 10);

        } else {
            System.out.println("Insira um valor válido!");
        }
        scanner.close();
    }
}
