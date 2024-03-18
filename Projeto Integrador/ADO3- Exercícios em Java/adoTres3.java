import java.util.Scanner;
public class anobi {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
                int ano;
                
                System.out.println("Digite um ano para saber se ele é bissexto");
                ano = scanner.nextInt();
                
             
                 if((ano % 4 == 0) && (ano % 100 != 0)){
                    System.out.println(ano + " é bissexto.");
                } else{
                    System.out.println(ano + " não é bissexto");
                }
           
       
        scanner.close();
     }
 }
