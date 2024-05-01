package ProjetoIntegrador.ADO4;

import java.util.Scanner;

public class AdoQuatro1 {
    public static void main(String[] args) {
        int diasSemana;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um número de 1 à 7 que equivale a cada dia da semana ");
        diasSemana = entrada.nextInt();

        switch (diasSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.print("O Valor " + diasSemana + " não é válido");

                entrada.close();
        }
    }
}