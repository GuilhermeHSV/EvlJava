package AlgoritmosProgramação.ADO2;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu peso");
        float peso = input.nextFloat();
        System.out.println("Digite a sua altura (Use vírgula Ex: 1,85)");
        float altura = input.nextFloat();
        float resultadoAltura = altura * altura;
        float imc = peso / resultadoAltura;

        System.out.println(imc);

        System.out.println("Você é : \n 1 - Homem \n 2 - Mulher");
        float resultado = input.nextFloat();

        if (resultado == 1) {

            if (imc < 19) {
                System.out.println("Abaixo do Normal");
            } else if ((imc >= 20) && (imc <= 25)) {
                System.out.println("Normal");
            } else if ((imc >= 25) && (imc < 30)) {
                System.out.println("Obesidade Leve");
            } else if ((imc >= 30) && (imc < 43)) {
                System.out.println("Obesidade Moderada");
            } else
                System.out.println("Obesidade Mórbida");

        } else {
            if (imc < 19) {
                System.out.println("Abaixo do Normal");
            } else if ((imc >= 19) && (imc <= 24)) {
                System.out.println("Normal");
            } else if ((imc >= 24) && (imc < 29)) {
                System.out.println("Obesidade Leve");
            } else if ((imc >= 29) && (imc < 39)) {
                System.out.println("Obesidade Moderada");
            } else
                System.out.println("Obesidade Mórbida");
        }
        input.close();
    }
}