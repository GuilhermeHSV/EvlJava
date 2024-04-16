import java.util.Scanner;

public class primeiraFuncao {
    public static int entradaDados() {
        System.out.println("*-* Entrada de Dados *-*");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Números: ");
        int n = scanner.nextInt();
        return n;
    }

    public static int minimo(int n1, int n2) {
        System.out.println("*-* Mínimo *-*");
        int min;
        if (n1 < n2) {
            min = n1;
        } else {
            min = n2;
        }
        return min;
    }

    public static void imprimir(int menor) {
        System.out.println("*-* Imprimir *-*");
        System.out.println("Menor: " + menor);
    }

    public static void main(String[] args) {
        int x = entradaDados();
        int y = entradaDados();
        int min = minimo(x, y);
        imprimir(min);
    }
}