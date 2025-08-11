import java.util.Random;

public class lista5 {
    public static void main(String[] args) {
        Random random = new Random();
        int N= random.nextInt(1,10);
        int [] Vet1 = new int[N];
        int [] Vet2 = new int[N];
        int [] distanziaparaunduelo = new int[N];
        int penalitad =0;
        int penalitadfinal =0;

        for ( int i =0 ;i < N ; i++){
            Vet1[i]= random.nextInt(1,10) ;
            Vet2[i]= random.nextInt(1,10);
            distanziaparaunduelo[i]= Vet1[i]* Vet1[i]+ Vet2[i]* Vet2[i];
        }
        for(int i = 0;i<N;i++){
            for(int k=0 ; k<N ; k++){
                if (distanziaparaunduelo[k] < distanziaparaunduelo[i]){
                    penalitad++;
                }
            }
            penalitadfinal += penalitad;
        }
        System.out.println(penalitadfinal);
    }
}
