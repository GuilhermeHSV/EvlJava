/* Escreva um programa em Java que leia 6 números do teclado.
   ao fim da execução o programa deve imprimir:
   - soma de todos os valores digitados que foram positivos
   - média de todos os valores digitados que foram positivos
 */

 import java.util.Scanner;
 public class exercicioNumeros {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         
         double num, soma = 0;
         int cont = 0;
         
         for(int i = 1; i<=6; i++){
            
             System.out.println("Digite um número");
             num = scanner.nextDouble(); 
             
             if(num >= 0){ 
                 soma = num + soma; 
                 cont++;
             }
            if(num >=0){
                System.out.println("Esse número é positivo " + num);
            } else if (num < 0){
                System.out.println("Esse número é negativo " + num);
            }
             
     }  
            
         System.out.println("A soma de todos os valores digitados: " + soma);
         System.out.println("A quantidade de números POSITIVOS digitados foi " + cont); 
         System.out.println("A média de todos os números digitados " + soma / cont); 


         scanner.close();
    }   
 }