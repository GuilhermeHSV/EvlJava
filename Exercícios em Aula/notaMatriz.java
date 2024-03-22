import java.util.Scanner;
public class notaMatriz{
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
            double[][] notasAlunos = new double [3][4];

            notasAlunos[0][0] = 7;
            notasAlunos[0][1] = 8;
            notasAlunos[0][2] = 5;
            notasAlunos[0][3] = 10;

            notasAlunos[1][0] = 8;
            notasAlunos[1][1] = 8;
            notasAlunos[1][2] = 9;
            notasAlunos[1][3] = 7;

            notasAlunos[2][0] = 2;
            notasAlunos[2][1] = 6;
            notasAlunos[2][2] = 7;
            notasAlunos[2][3] = 10;
            double soma;
            double media;
            for(int i = 0; i < notasAlunos.length; i++){
              soma = 0;
                for(int j = 0; j < notasAlunos[i].length; j++){
                    soma += notasAlunos[i][j];
                    }
                    media = soma / 4;
                

               System.out.println("A média do aluno "+ i + " é " + media);

            }


        scanner.close();
    }
}