import java.util.Scanner;
public class mediaLaco{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("***Calculo de Nota***\n Digite a primeira nota: ");
        float n1 = scanner.nextFloat();
        System.out.println("***Calculo de Nota***\n Digite a segunda nota: ");
        float n2 = scanner.nextFloat();
        System.out.println("***Calculo de Nota***\n Digite a terceira nota: ");
        float n3 = scanner.nextFloat();

        float media = (n1 + n2 + n3) / 3;
        System.out.printf("%.2f", media);

        scanner.close();
    }
}