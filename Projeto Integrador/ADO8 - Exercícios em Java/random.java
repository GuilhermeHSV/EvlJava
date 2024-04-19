import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        int qtdVezes = 1000000;
        int frequenciaFace1 = 0;
        int frequenciaFace2 = 0;
        int frequenciaFace3 = 0;
        int frequenciaFace4 = 0;
        int frequenciaFace5 = 0;
        int frequenciaFace6 = 0;

        for (int i = 0; i < qtdVezes; i++) {

            int dado = random.nextInt(6) + 1;

            switch (dado) {
                case 1:
                    frequenciaFace1++;
                    break;
                case 2:
                    frequenciaFace2++;
                    break;
                case 3:
                    frequenciaFace3++;
                    break;
                case 4:
                    frequenciaFace4++;
                    break;
                case 5:
                    frequenciaFace5++;
                    break;
                case 6:
                    frequenciaFace6++;
                    break;
            }
        }

        System.out.println("Porcentagem de vezes que cada face apareceu:");
        double total = (double) qtdVezes;
        System.out.println("Face 1: " + (frequenciaFace1 / total * 100) + "%");
        System.out.println("Face 2: " + (frequenciaFace2 / total * 100) + "%");
        System.out.println("Face 3: " + (frequenciaFace3 / total * 100) + "%");
        System.out.println("Face 4: " + (frequenciaFace4 / total * 100) + "%");
        System.out.println("Face 5: " + (frequenciaFace5 / total * 100) + "%");
        System.out.println("Face 6: " + (frequenciaFace6 / total * 100) + "%");
    }
}
