package edu.guilherme.ExerciciosEmAula;

import java.util.Scanner;

public class AdicionandoValoresMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos valores deseja adicionar");
        int tamanho = scanner.nextInt();
        double aux = 0;
        double[] notas = new double[tamanho];
        double[] medias = new double[tamanho / 2];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
        }
        for (int i = 0; i < medias.length; i++) {
            aux = (notas[i] + notas[i + 1]) / 2;
            medias[i] = aux;
        }
        for (int i = 0; i < medias.length; i++) {
            System.out.println(medias[i]);
        }
        scanner.close();
    }
}
