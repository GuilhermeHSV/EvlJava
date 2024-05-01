package edu.guilherme.AlgoritmosProgramação.PROVA1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner tecla = new Scanner(System.in);
        int maior = 0;
        int numero = 0;
        int menor = Integer.MAX_VALUE;

        System.out.println("Contador de números!!");
        System.out.println("---------------------");

        do {
            System.out.println("Digite um número inteiro ou negativo!");
            numero = tecla.nextInt();
            if (numero < 0) {
                break;
            }
            if (maior < numero) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        } while (numero > 0);
        System.out.println("O maior número é: " + maior + "\n E o menor é: " + menor);
    }
}