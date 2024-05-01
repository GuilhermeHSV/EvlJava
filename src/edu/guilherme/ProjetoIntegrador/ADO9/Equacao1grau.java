package edu.guilherme.ProjetoIntegrador.ADO9;

import java.util.Random;
import java.util.Scanner;

public class Equacao1grau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor mínimo:");
        int min = scanner.nextInt();

        System.out.println("Digite o valor máximo:");
        int max = scanner.nextInt();

        Random random = new Random();

        int a = random.nextInt((max - min) + 1) + min;
        int b = random.nextInt((max - min) + 1) + min;

        System.out.println("A equação é: " + a + "x + " + b + " = 0");

        double solucao = -b / (double) a;

        System.out.printf("A solução da equação é x = %.2f", solucao);

        scanner.close();
    }
}
