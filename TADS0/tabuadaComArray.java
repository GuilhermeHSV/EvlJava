import java.util.Scanner;

public class tabuadaComArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva um número: ");
    int num = scanner.nextInt();

    int[] tabuada = new int[11];

    for (int posicao = 0; posicao < tabuada.length; posicao++) {
      tabuada[posicao] = num * posicao;
    }

    System.out.println("A tabuada é: ");
    for (int item : tabuada) {
      System.out.println(item);
    }
    scanner.close();
  }

}