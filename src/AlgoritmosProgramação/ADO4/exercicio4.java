package AlgoritmosProgramação.ADO4;

/*
 * Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
1. Soma de todos os valores digitados que foram positivos;
2. Quantidade de valores digitados que foram positivos.
3. Média (decimal) de todos os valores digitados que foram positivos.
 */
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0, soma = 0, num, cont = 0;
        while (i < 6) {
            i++;
            System.out.println("Digite o " + i + "° número!");
            num = scanner.nextInt();

            if (num >= 0) {
                soma = num + soma;
                cont++;
            }

            System.out.println("A soma é " + soma);
            System.out.println("A Quantidade de números positivos são " + cont);
            System.out.println("A média é " + soma / cont);
        }

        scanner.close();
    }
}
