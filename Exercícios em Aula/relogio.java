import java.util.Scanner;

public class relogio {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Hora: ");
        int horaAlarme = scanner.nextInt();
        System.out.println("Minutos: ");
        int minutoAlarme = scanner.nextInt();
        System.out.println("Segundos ");
        int segundoAlarme = scanner.nextInt();

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.printf("%d:%d:%d\n", h, m, s);
                    if (h == horaAlarme && m == minutoAlarme && s == segundoAlarme) {
                        System.out.println("Alarme!");
                        break;
                    }

                }
                if (h == horaAlarme && m == minutoAlarme) {
                    break;
                }
            }
            if (h == horaAlarme) {
                break;
            }
        }
        scanner.close();
    }
}
