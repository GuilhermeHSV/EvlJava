package edu.guilherme.ProjetoIntegrador.ADO7;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class CollectionsJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String escolha;
        ArrayList<String> questoes = new ArrayList<String>();
        boolean i = false;
        questoes.add("a) Nenhuma solução real.");
        questoes.add("b) Uma única solução real.");
        questoes.add("c) Duas soluções reais.");
        questoes.add("d) Três soluções reais.");
        questoes.add("e) Infinitas soluções reais.");

        do {

            System.out.println(
                    "Analisando a equação do segundo grau x^2 – 2x +1 = 0, podemos afirmar que ela possui:");
            for (String questao : questoes) {
                System.out.println(questao);
            }

            escolha = scanner.next();
            switch (escolha) {
                case "b":
                case "B":
                    i = true;
                    System.out.println("Resposta correta!");
                    return;
                case "a":
                case "A":
                case "c":
                case "C":
                case "d":
                case "D":
                case "e":
                case "E":
                    System.out.println("Resposta incorreta!");
                    break;

            }
            Collections.shuffle(questoes);
        } while (i == false);

        scanner.close();
    }
}
