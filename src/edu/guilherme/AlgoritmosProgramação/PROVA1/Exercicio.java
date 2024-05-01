package edu.guilherme.AlgoritmosProgramação.PROVA1;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        // Giovanni Campos
        // Guilherme Vasconcellos

        @SuppressWarnings("resource")
        Scanner tecla = new Scanner(System.in);
        System.out.println("Qual o combustível desejado?(1 para gasolina e 2 para etanol): ");
        int resposta = tecla.nextInt();
        if (resposta == 1) {
            System.out.println("Você escolheu gasolina!");
            System.out.println("Quantos litros de gasolina você deseja?");
            double litros = tecla.nextDouble();
            double preco = litros * 4.79;
            if (litros <= 10) {
                double desconto5 = preco * 0.95;
                System.out.printf("Seu preço com desconto ficou %.2f: ", desconto5);
            } else if (litros > 10) {
                double desconto7 = preco * 0.93;
                System.out.printf("Seu preço com desconto ficou %.2f: ", desconto7);
            }
        }
        if (resposta == 2) {
            System.out.println("Você escolheu Etanol!");
            System.out.println("Quantos litros de etanol você deseja?");
            double litros = tecla.nextDouble();
            double preco = litros * 3.65;
            if (litros <= 5) {
                System.out.println("O seu pedido ficou em: " + preco);
            } else if (litros > 5) {
                double desconto10 = preco * 0.90;
                System.out.printf("O seu pedido com desconto ficou em %.2f: ", desconto10);
            }
        }

    }
}