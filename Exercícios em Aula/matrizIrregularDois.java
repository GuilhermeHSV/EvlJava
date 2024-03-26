import java.util.Scanner;

public class matrizIrregularDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos Alunos você quer registrar a nota ?");
        int qtdAlunos = scanner.nextInt();

        double[][] notasAlunos = new double[qtdAlunos][];

        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println("Quantas notas serão inseridas para o aluno " + (i + 1) + "?");
            int qtdNotas = scanner.nextInt();

            notasAlunos[i] = new double[qtdNotas];
            double somaNota = 0;

            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println("Digite a " + (j + 1) + " nota do aluno " + (i + 1) + ": ");
                notasAlunos[i][j] = scanner.nextDouble();
                somaNota += notasAlunos[i][j];
            }

            double mediaNota = somaNota / qtdNotas;
            System.out.printf("A média do aluno %d é %.2f\n", (i + 1), mediaNota);
        }

        scanner.close();
    }
}
