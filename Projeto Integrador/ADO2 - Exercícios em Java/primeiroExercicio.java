import java.util.Scanner;

public class primeiroExercicio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro número");
    float n1 = scanner.nextFloat();
    System.out.println("Digite o segundo número");
    float n2 = scanner.nextFloat();
    System.out.println("Digite o terceiro número");
    float n3 = scanner.nextFloat();

    System.out.println("O primeiro número é "+ n1 + " O segundo número é " + n2 + " O terceiro número é " + n3);
    
    scanner.close();
  }
    

}