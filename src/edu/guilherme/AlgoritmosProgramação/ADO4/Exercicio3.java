package edu.guilherme.AlgoritmosProgramação.ADO4;

/*
 * Crie um laço que imprima uma contagem regressiva de 100 a 0, mas que decremente
de 5 em 5. Use o laço for.
 */
public class Exercicio3 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }
}
