import java.util.Scanner;

public class lacoWhileFatorial {
  public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um número para fazer a fatoração dele: ");
        int num = scanner.nextInt();
        int volta = num;
        int fat = 1;
        while (volta >= 1){
            fat *= volta;

            
        System.out.println(fat);
            volta --;
         
        }
        scanner.close();

    }

}