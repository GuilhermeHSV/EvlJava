/* 
Utilize a estrutura switch dentro de um laço do-while, na implementação. O
menu deixará de ser mostrado apenas quando o usuário escolher a opção 4 –
Sair.
*/
package ProjetoIntegrador.ADO5;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean estrutura = false;
        int escolha;
        do {
            System.out.println("1 - Instruções \n2 - Jogar \n3 - Créditos \n4 - Sair");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Clicou em Instruções!\n ");
                    break;
                case 2:
                    System.out.println("Clicou em Jogar!\n ");
                    break;
                case 3:
                    System.out.println("Clicou em Créditos!\n ");
                    break;
                case 4:
                    System.out.println("Clicou em Sair!\n ");
                    estrutura = true;
                    break;
            }

        } while (!estrutura);

        scanner.close();
    }
}
