import java.util.Scanner;

public class matrizIrregularTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Programa de média escolar! ***\n");
        System.out.println("Digite o número de Alunos que você gostaria de inserir! ");
        int qtdAlunos = scanner.nextInt();
        System.out.println("Digite quantas notas sertão inseridas! ");
        int qtdNotas = scanner.nextInt();
        double[][] notasAlunos = new double[qtdAlunos][];

        for (int i = 0; i < notasAlunos.length; i++) {
            notasAlunos[i] = new double[qtdNotas];
            double somaQtdNotas = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println("Digite as notas do " + (i + 1) + "° aluno: ");
                notasAlunos[i][j] = scanner.nextDouble();
                somaQtdNotas += notasAlunos[i][j];
            }
            double mediaNotas = somaQtdNotas / qtdNotas;

            System.out.printf("A média do aluno é %.2f\n", mediaNotas);
        }
        scanner.close();

    }
}
