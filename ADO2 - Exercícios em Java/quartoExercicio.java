import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um nome não composto: ");
    String nome = scanner.next();

    int quantidadeCaracteres = nome.length();

    System.out.println("O nome " + nome + " possui " + quantidadeCaracteres + " caracteres.");

    scanner.close();
  }
}
