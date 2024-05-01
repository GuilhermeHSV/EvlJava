package edu.guilherme.TADS0;

import java.util.Scanner;

public class LacoRepeticaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Até qual número você quer que apareça: ");
        int fim = scanner.nextInt();

        int contagem = 0;
        while (contagem <= fim) {
            System.out.println(contagem);
            contagem++;

        }
        scanner.close();
    }
}