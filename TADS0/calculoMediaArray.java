import java.util.Scanner;

public class calculoMediaArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float[] vetor = new float[3];

    for (int pos = 0; pos < vetor.length; pos++) {
      System.out.println("Digite sua nota");
      vetor[pos] = scanner.nextFloat();
    }

    scanner.close();

    System.out.println("As notas adicionadas foram :");
    for (int pos = 0; pos < vetor.length; pos++) {
      System.out.println("Nota " + (pos + 1) + ": " + vetor[pos]);

    }
    float media = (vetor[0] + vetor[1] + vetor[2]) / 3;

    
  if ((media > 10) || (media < 0)){
      System.out.println("Média inválida");
    
  }else{
    if (media >= 7) {
      System.out.println("Aprovado");
    } else if (media >= 5) {
      System.out.println("Recuperação");
    } else if (media < 5) {
      System.out.println("Reprovado");
    } else {
      System.out.println("Error");
    }
      System.out.printf("Sua média é %.1f  \n", media);

  }
}
}