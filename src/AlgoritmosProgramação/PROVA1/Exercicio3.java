package AlgoritmosProgramação.PROVA1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner tecla = new Scanner(System.in);
        int resposta = 1;

        System.out.println("Calculadora de imposto de renda familiar!!");
        System.out.println("------------------------------------------");

        do {
            System.out.println("Digite sua renda familiar: ");
            double renda = tecla.nextDouble();
            if (renda <= 1903.98) {
                System.out.println("Você está isento de imposto!");
                System.out.println("Logo sua renda bruta é: " + renda);
            } else if (renda >= 1903.99 && renda <= 2826.65) {
                double imposto = renda * (7.5 / 100);
                double liquido = renda - imposto;
                System.out.printf("Sua renda bruta é: %.2f \nE seu imposto a ser pago é %.2f \nNum total de %.2f\n",
                        renda, imposto, liquido);
            } else if (renda >= 2826.66 && renda <= 3751.05) {
                double imposto = renda * (15 / 100);
                double liquido = renda - imposto;
                System.out.printf("Sua renda bruta é: %.2f \nE seu imposto a ser pago é %.2f \nNum total de %.2f\n",
                        renda, imposto, liquido);
            } else if (renda >= 3751.06 && renda <= 4664.68) {
                double imposto = renda * (22.5 / 100);
                double liquido = renda - imposto;
                System.out.printf("Sua renda bruta é: %.2f \nE seu imposto a ser pago é %.2f \nNum total de %.2f\n",
                        renda, imposto, liquido);
            } else if (renda > 4664.68) {
                double imposto = renda * (27.5 / 100);
                double liquido = renda - imposto;
                System.out.printf("Sua renda bruta é: %.2f \nE seu imposto a ser pago é %.2f \nNum total de %.2f\n",
                        renda, imposto, liquido);
            }
            System.out.println("Deseja colocar outra renda?\n 1-sim\n2-não");
            resposta = tecla.nextInt();
        } while (resposta == 1);
    }
}
