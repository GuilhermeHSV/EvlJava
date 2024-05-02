package edu.guilherme.AlgoritmosProgramação.ADO6;

/*
 * 1) Função para obter o tamanho do vetor
 * 2) Função para criar
 * 3) Função para preencher um vetor
 * 4) Função para imprimir os elementos do vetor
 * 
 */

import java.util.Scanner;

public class vetor {

    // 1) Função para obter o tamanho do vetor
    public static int tamanhoVetor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*-* Tamanho do Vetor*-*");
        System.out.println("Digite o Tamanho:");
        int t = scanner.nextInt();
        scanner.close();
        return t;
    }

    // 2) Função para criar o vetor
    public static int[] criarVetor(int t) {
        System.out.println("*-* Criar o Vetor *-*");
        // instanciando o vetor com o tamanho de 't'
        int[] vetor = new int[t];
        return vetor;
    }

    // 3) Função para preencher o vetor
    public static int[] populaVetor(int[] v) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*-* Populando o Vetor *-*");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Vetor[%d]: ", i);
            v[i] = scanner.nextInt();
        }
        scanner.close();
        return v;
    }

    // 4) Função para imprimir os valores do vetor
    public static void imprimir(int[] vetor) {
        System.out.println("*-* Imprimir o Vetor *-*");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%d]: %d \n", i, vetor[i]);
        }
    }

    public static int obterNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*-* Obter Número*-*");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public static int verificarOcorrencias(int[] v, int n) {
        System.out.println("*-* Verificar Ocorrências *-*");
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.println("*** MAIN ***");
        int t = tamanhoVetor();
        int[] vetor = criarVetor(t);
        imprimir(vetor);
        vetor = populaVetor(vetor);
        imprimir(vetor);
        int n = obterNumero();
        System.out.printf("O número %d apareceu %d vezes\n", n, verificarOcorrencias(vetor, n));
    }
}