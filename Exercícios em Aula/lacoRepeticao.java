/**
int i; 
for(i = 0; i<10; i= i + 1){ // O i serve como uma variável de controle
    //comando
}

 //int i = 0 é o inicio
 //i<10 é a condição
 //i=i++ é o incremento igual a i=i +1
for(int i = 0; i<10; i= i ++){ 
    //comando
}

**/
import java.util.Scanner;
public class lacoRepeticao {
    public static void main (String[] args){
            Scanner scanner = new Scanner (System.in);
    
        System.out.println("Início: ");
        int inicio = scanner.nextInt();
           System.out.println("Fim: ");
        int fim = scanner.nextInt();
        
            if (inicio < fim) {
                for(int i = inicio; i<=fim; i++){
                System.out.println("i: " + i);
                }    
            }else if (inicio > fim){
                for(int i = inicio; i>=fim; i--){
                System.out.println("i: " + i);
                }
            }else{
                System.out.println("Os valores são iguais!");
            }
            scanner.close();
        }
    }

 

    
    