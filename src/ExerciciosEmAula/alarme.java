package ExerciciosEmAula;

import java.util.Scanner;

public class Alarme {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        String diaSemana = scanner.next();
        System.out.println("Dia da Semana (1-7): ");
        int dia = scanner.nextInt(); // Pega a linha inteira, invés de pegar somente uma palavra
        System.out.println("Hora: ");
        int horaAlarme = scanner.nextInt();
        System.out.println("Minutos: ");
        int minutoAlarme = scanner.nextInt();
        System.out.println("Segundos ");
        int segundoAlarme = scanner.nextInt();

        for (int d = 1; d <= 7; d++) {

            switch (d) {
                case 1:
                    diaSemana = "Domingo";
                    break;
                case 2:
                    diaSemana = "Segunda-Feira";
                    break;
                case 3:
                    diaSemana = "Terça-Feira";
                    break;
                case 4:
                    diaSemana = "Quarta-Feira";
                    break;
                case 5:
                    diaSemana = "Quinta-Feira";
                    break;
                case 6:
                    diaSemana = "Sexta-Feira";
                    break;
                case 7:
                    diaSemana = "Sábado";
                    break;

            }
            for (int h = 0; h < 24; h++) {
                for (int m = 0; m < 60; m++) {
                    for (int s = 0; s < 60; s++) {
                        System.out.printf("%s - %d:%d:%d\n", diaSemana, h, m, s);
                        if (d == dia && h == horaAlarme && m == minutoAlarme && s == segundoAlarme) {
                            System.out.println("Alarme!");
                            break;
                        }

                    }
                    if (d == dia && h == horaAlarme && m == minutoAlarme) {
                        break;
                    }
                }
                if (d == dia && h == horaAlarme) {
                    break;
                }
            }
            if (dia == d) {
                break;
            }
        }

        scanner.close();
    }
}
