package ProjetoIntegrador.ADO2;

import java.util.Scanner;

public class terceiroExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro de 1 até 10: ");
        int n = scanner.nextInt();

        String[] tabuada = {
                "1 x " + n + " = " + (1 * n),
                "2 x " + n + " = " + (2 * n),
                "3 x " + n + " = " + (3 * n),
                "4 x " + n + " = " + (4 * n),
                "5 x " + n + " = " + (5 * n),
                "6 x " + n + " = " + (6 * n),
                "7 x " + n + " = " + (7 * n),
                "8 x " + n + " = " + (8 * n),
                "9 x " + n + " = " + (9 * n),
                "10 x " + n + " = " + (10 * n)
        };

        System.out.println("Tabela da tabuada de " + n + ":");
        for (String linha : tabuada) {
            System.out.println(linha);
        }

        scanner.close();
    }
}
