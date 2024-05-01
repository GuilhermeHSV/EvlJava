package AlgoritmosProgramação.ADO4;

/*
 * Faça um programa que mostre os números pares entre 1 e 100. Use o laço while.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 100) {
            num++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
