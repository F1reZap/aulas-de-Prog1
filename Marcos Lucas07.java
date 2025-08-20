//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. AAAAAAAAAAAAH nn foi a maldita colunaaaaaaa (falhou
//teste2. testei fazer a matriz com n° igual de colunas e linhas e adicionar um vetor de colunas (falhou pras colunas dnvvvvvv
//teste3. yup resorvi as colunas com a booleana (funcinou
import java.util.Random;
import java.util.Scanner;

//7. Uma matriz quadrada de dimensão n é dita uma matriz permutação se em cada linha e em cada coluna
//houver n-1 elementos nulos e um único elemento igual à 1. Dada uma matriz digitada pelo usuário,
//informe se a mesma é ou não uma matriz permutação.
//Ex.: Matriz permutação:
//[0 0 0 1
//1 0 0 0
//0 1 0 0
//0 0 1 0]
public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("N° de linhas/colunas da matriz (matriz quadrada):");
        int n = teclado.nextInt();

        int[][] mat1 = new int[n][n];
        int[] vetLinha = new int[n];
        int[] vetColuna = new int[n];

        // for de preenchimento [caramba eu faço comentarios pra caramba tudo pra documentar esses código de doido seus bruno]
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat1[i][j] = random.nextInt(0, 2);
                System.out.print(mat1[i][j] + ".");
            }
            System.out.println();
        }

        // Contando 1s por linha e coluna da matrix
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(mat1[i][j] == 1){
                    vetLinha[i]++;
                    vetColuna[j]++;
                }
            }
        }

        // AAAAAAAAH to tendo q usar Booleana aaaaaaaah
        boolean ePermutacao = true;
        for (int i=0; i<n; i++){
            if (vetLinha[i] != 1 || vetColuna[i] != 1){
                ePermutacao = false;
                break;
            }
        }

        if (ePermutacao){
            System.out.println("É uma matriz permutação!");
        } else {
            System.out.println("NÃO é uma matriz permutação!");
        }
    }
}