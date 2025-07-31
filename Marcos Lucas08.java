import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args) {
        int notas[] = new int[80], nt=0;
        int [] FreqAbsol = new int[11];
        double [] FreqRelat = new double[11];

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i<80; i++){
            nt = random.nextInt(0, 11);
            notas[i] = nt;
            if (nt == 0){
                FreqAbsol[0]++;
            } else if (nt == 1) {
                FreqAbsol[1]++;
            } else if (nt==2) {
                FreqAbsol[2]++;
            } else if (nt==3) {
                FreqAbsol[3]++;
            } else if (nt==4) {
                FreqAbsol[4]++;
            } else if (nt==5) {
                FreqAbsol[5]++;
            } else if (nt==6) {
                FreqAbsol[6]++;
            } else if (nt==7) {
                FreqAbsol[7]++;
            } else if (nt==8) {
                FreqAbsol[8]++;
            } else if (nt==9) {
                FreqAbsol[9]++;
            } else if (nt==10) {
                FreqAbsol[10]++;
            }
        }
        for (int j=0; j<11; j++){
            if (j ==0){
                FreqRelat[0]=((double) FreqAbsol[0] /80)*100;
            } else if (j ==1) {
                FreqRelat[1]=((double) FreqAbsol[1] /80)*100;
            } else if (j ==2) {
                FreqRelat[2]=((double) FreqAbsol[2] /80)*100;
            } else if (j ==3) {
                FreqRelat[3]=((double) FreqAbsol[3] /80)*100;
            }else if (j ==4) {
                FreqRelat[4]=((double) FreqAbsol[4] /80)*100;
            }else if (j ==5) {
                FreqRelat[5]=((double) FreqAbsol[5] /80)*100;
            } else if (j ==6) {
                FreqRelat[6]=((double) FreqAbsol[6] /80)*100;
            }else if (j ==7) {
                FreqRelat[7]=((double) FreqAbsol[7] /80)*100;
            }else if (j ==8) {
                FreqRelat[8]=((double) FreqAbsol[8] /80)*100;
            }else if (j ==9) {
                FreqRelat[9]=((double) FreqAbsol[9] /80)*100;
            }else if (j ==10) {
                FreqRelat[10]=((double) FreqAbsol[10] /80)*100;
            }
        }
        System.out.println("Frequencia Absoluta: "+Arrays.toString(FreqAbsol));
        System.out.println("Frequencia Relativa[em %]: "+Arrays.toString(FreqRelat));
        System.out.println("notas: "+Arrays.toString(notas));
    }
}