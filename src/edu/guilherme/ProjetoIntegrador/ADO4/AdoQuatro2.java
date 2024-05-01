package edu.guilherme.ProjetoIntegrador.ADO4;

import java.util.Scanner;

public class AdoQuatro2 {
    public static void main(String[] args) {
        String escolha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** Questão de Matemática ***");

        System.out.println(
                "Qual é a base dos números binarios? \n a)Base 10 \n b)Base 2 \n c)Base 8 \n d)Base 16 \n e)Nenhuma das anteriores");
        escolha = entrada.next();
        switch (escolha) {
            case "a":
            case "A":
                System.out.println("Resposta Incorreta!");
                break;
            case "b":
            case "B":
                System.out.println("Resposta Correta!");
                break;
            case "c":
            case "C":
                System.out.println("Respostas Incorreta!");
                break;
            case "d":
            case "D":
                System.out.println("Resposta Incorreta!");
                break;
            case "e":
            case "E":
                System.out.println("Resposta Incorreta!");
                break;
            default:
                System.out.println("Valor " + escolha + " Inválido");

        }
        ;

        entrada.close();
    }
}
