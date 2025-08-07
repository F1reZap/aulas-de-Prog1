//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. imprimir uma matriz usando Arrays.tostring (falhou)
//teste2. impressão usando for                       (falhou)
//teste3. limpando buffers                           (falhou)
//teste4. trocando valores inteiros por .length      (Funcionou)
//teste5. multiplicando                              (Funcionou)

import java.util.Random;
import java.util.Scanner;

//Faça um programa que preencha uma matriz 2 x 2, calcule e mostre uma matriz resultante que será a
//matriz digitada multiplicada pelo maior elemento da mesma.
public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[][] Mat = new int[3][5];
        int[]Vet1 = new int[5];
        int[]Vet2 = new int[5];
        int[]Vet3 = new int[5];
        int valVet1=0, valVet2=0, valVet3=0;
        int preenche = 0, maior=0;
        for (int i = 0; i<Mat.length; i++){
            for (int j=0; j<Mat[i].length; j++){
//                System.out.println("Digite o valor da linha "+i+" coluna "+j);
                preenche = random.nextInt(0, 1000);
                Mat[i][j]= preenche;
                if (i==0){
                    Vet1[j]=preenche;
                } else if (i==1) {
                    Vet2[j]=preenche;
                } else if (i==2) {
                    Vet3[j]=preenche;
                }
                if (i==0){
                    maior=preenche;
                } else if (preenche>maior) {
                    maior=preenche;
                }
            }
        }
        for (int i=0; i<Mat.length; i++){
            valVet1= valVet1+Vet1[i];
            valVet2= valVet2+Vet2[i];
            valVet3= valVet3+Vet3[i];
        }
        for (int i=0; i<3; i++){
            if (i==0){
                maior=valVet1;
            } else if (valVet2>maior) {
                maior=valVet2;
            } else if (valVet3>maior) {
                maior=valVet3;
            }
        }
        for (int i=0; i<Mat.length; i++){
            for (int j=0; j<Mat[i].length; j++){
                System.out.println("Valor da linha "+i+" coluna "+j+" é "+Mat[i][j]);
            }
            if (maior==valVet1){
                System.out.println("Linha 1 é a maior soma seu valor sendo: "+maior);
            } else if (maior == valVet2) {
                System.out.println("Linha 2 é a maior soma seu valor sendo: "+maior);
            } else if (maior==valVet3) {
                System.out.println("Linha 3 é a maior soma seu valor sendo: "+maior);
            }
        }
    }
}