package ExerciciosEmAula;
public class vetor{
    public static void main (String[]args){
        int t = 10;
        int[] v = new int[t];
        
        for (int i = 0; i<10; t++){
            v[i] = i;
        }
        System.out.println("vetor" + v);


        for (int i = 0; i<t; i++){
            System.out.printf("vetor[%d]: \n", t);
        }

    }


}