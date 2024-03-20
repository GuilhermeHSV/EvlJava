import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int escolha = 0;
    float calc = 0;
    float num1;
    float num2;

    do {
      System.out.println(
          "Escolha uma operação matemática: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 0 - Sair");
      escolha = scanner.nextInt();

      switch (escolha) {
        case 1:
          System.out.println("Digite o primeiro número: ");
          num1 = scanner.nextFloat();
          System.out.println("Digite o segundo número: ");
          num2 = scanner.nextFloat();
          calc = num1 + num2;
          System.out.println("O resultado da Adição é " + calc);
          break;
        case 2:
          System.out.println("Digite o primeiro número: ");
          num1 = scanner.nextFloat();
          System.out.println("Digite o segundo número: ");
          num2 = scanner.nextFloat();
          calc = num1 - num2;
          System.out.println("O resultado da Subtração é " + calc);
          break;
        case 3:
          System.out.println("Digite o primeiro número: ");
          num1 = scanner.nextFloat();
          System.out.println("Digite o segundo número: ");
          num2 = scanner.nextFloat();
          calc = num1 * num2;
          System.out.println("O resultado da Mutiplicação é " + calc);
          break;
        case 4:
          System.out.println("Digite o primeiro número: ");
          num1 = scanner.nextFloat();
          System.out.println("Digite o segundo número: ");
          num2 = scanner.nextFloat();
          calc = num1 / num2;
          System.out.println("O resultado da Divisão é " + calc);
          break;

      }
      ;

    } while (escolha != 0);
    System.out.println("Programa Finalizado!");
    scanner.close();
  }

}