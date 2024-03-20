import java.util.Scanner;

public class lacoWhileTabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número para calcular a tabuada: ");
    int num = scanner.nextInt();

    int tabuada = 0;

    while (tabuada <= 10) {

      int calculo = tabuada * num;

      System.out.println(num + "*" + tabuada + " é = " + calculo);
      scanner.close();
      tabuada++;
    }

  }

}