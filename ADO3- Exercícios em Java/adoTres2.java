import java.util.Scanner;

public class piramide {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int a, b, c;
        System.out.println("Digite o primeiro valor: "); 
        a = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = scanner.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        c = scanner.nextInt();       

            if(a + b > c && a + c > b && b + c > a){
                System.out.println("Os 3 lados formam um triangulo!\n");
                if(a == b && a == c)
                System.out.println("Equilatero\n");
                else
                    if(a == b || a == c || b == c)
                    System.out.println("Isosceles\n");
                    else
                    System.out.println("Escaleno\n");
            }
            else
            System.out.println("Os 3 lados NAO formam um trinagulo!\n");

            scanner.close();
        }
    }

