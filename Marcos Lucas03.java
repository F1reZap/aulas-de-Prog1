//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. teste da fase de matriz e dias com a maior produção (Funcionou)
//teste2. teste de média de produção.                         (Funcionou)
//teste3. teste final com o sistema completo 1ª tentativa     (Funcionou)


import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//A produção diária de uma fábrica é armazenada, semana a semana, em uma tabela com o seguinte
//formato:(foto)

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Quantas semanas deverão ser analisadas: ");
        int N = teclado.nextInt();

        int[][] Fabr = new int[N][7];
        int[] Prod = new int[N];
        int[] dia = new int[N];
        int prench, prodmed1=0, diasacim=0;
        double prodmed2, sum=0;
        for (int i=0; i<Fabr.length; i++){
            for (int j=0; j< Fabr[i].length; j++){
                prench = random.nextInt(0, 100);
                Fabr[i][j] = prench;
                prodmed1=prodmed1+prench;
                if (j==0){
                    Prod[i]=prench;
                    dia[i]=j+1;
                } else {
                    if (prench<Prod[i]){
                        Prod[i]=prench;
                        dia[i]= j+1;
                    }
                }
            }
            prodmed2 = (double) prodmed1 /7;
            sum+= prodmed2;
        }
        double prodmedfinal= sum/N;
        for (int i=0; i<Fabr.length; i++){
            for (int j=0; j<Fabr[i].length; j++){
                if (Fabr[i][j]>prodmedfinal){
                    diasacim++;
                }
            }
        }
        for (int i=0; i<dia.length; i++){
            System.out.println("Semana "+(i+1)+". Dia de minima produção: "+dia[i]);
        }
//        System.out.println(Arrays.toString(Prod));
//        System.out.println(Arrays.toString(dia));
        System.out.println("Produção média de "+N+" Semanas: "+prodmedfinal);
        System.out.println("Total de dias com a produção acima da média: "+diasacim);

    }
}