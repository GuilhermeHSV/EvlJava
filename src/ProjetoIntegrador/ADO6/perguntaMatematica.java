package ProjetoIntegrador.ADO6;

import java.util.Scanner;

public class PerguntaMatematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String escolha;

        int i = 1;

        do {
            System.out.println("Tentativa " + i);
            System.out.println(
                    "Analisando a equação do segundo grau x^2 – 2x +1 = 0, podemos afirmar que ela possui: \n a) Nenhuma solução real. \n b) Uma única solução real. \n c) Duas soluções reais. \n d) Três soluções reais. \n e) Infinitas soluções reais.");
            escolha = scanner.next();

            switch (escolha) {
                case "b":
                case "B":
                    System.out.println("Resposta correta! \nAcertou na tentativa " + i);
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
            i++;

        } while (i <= 3);

        if (i >= 3) {
            System.out.println("Resposta incorreta nas 3 tentativas.");
        }

        scanner.close();
    }
}