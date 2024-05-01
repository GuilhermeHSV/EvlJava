package edu.guilherme.ExerciciosEmAula;

import java.util.Scanner;

public class MediaLaco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        do {
            System.out.println("***Calculo de Nota***\n Digite a primeira nota: ");
            float n1 = scanner.nextFloat();
            System.out.println("***Calculo de Nota***\n Digite a segunda nota: ");
            float n2 = scanner.nextFloat();
            System.out.println("***Calculo de Nota***\n Digite a terceira nota: ");
            float n3 = scanner.nextFloat();

            float media = (n1 + n2 + n3) / 3;

            System.out.printf("Sua média é %.2f", media);

            System.out.println("\nDeseja executar o programa de novo? \nSIM - 1\nNÃO - 0");
            escolha = scanner.nextInt();
            if ((escolha > 1) || (escolha < 0)) {
                System.out.println("Valor inserido inválido");
            }

        } while (escolha == 1);
        scanner.close();
    }
}
