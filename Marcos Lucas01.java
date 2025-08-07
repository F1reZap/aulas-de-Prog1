//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. imprimir uma matriz usando Arrays.tostring (falhou)
//teste2. impressão usando for                       (falhou)
//teste3. limpando buffers                           (falhou)
//teste4. trocando valores inteiros por .length      (Funcionou)
//teste5. multiplicando                              (Funcionou)

import java.util.Scanner;

//Faça um programa que preencha uma matriz 2 x 2, calcule e mostre uma matriz resultante que será a
//matriz digitada multiplicada pelo maior elemento da mesma.
public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[][] Mat = new int[2][2];
        int preenche = 0, maior=0;

        for (int i = 0; i<Mat.length; i++){
            for (int j=0; j<Mat[i].length; j++){
                System.out.println("Digite o valor da linha "+i+" coluna "+j);
                preenche = teclado.nextInt();
                Mat[i][j]= preenche;
                if (i==0){
                    maior=preenche;
                } else if (preenche>maior) {
                    maior=preenche;
                }
            }
        }
        for (int i=0; i<Mat.length; i++){
            for (int j=0; j<Mat[i].length; j++){
                Mat[i][j] = Mat[i][j]*maior;
            }
        }
        for (int i=0; i<Mat.length; i++){
            for (int j=0; j<Mat[i].length; j++){
                System.out.println("Valor da linha "+i+" coluna "+j+" é "+Mat[i][j]);

            }
        }
    }
}