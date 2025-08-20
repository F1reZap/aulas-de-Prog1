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

        System.out.println("N° das linhas (e das colunas):");
        int n = teclado.nextInt();

        int[][] matrix = new int[n][n];
        int[] Linha = new int[n];
        int[] Coluna = new int[n];

        //for de preenchimento (Bruno nn aguento mais documentar aaaah)
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j] = random.nextInt(0, 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(matrix[i][j] == 1){
                    Linha[i]++;
                    Coluna[j]++;
                }
            }
        }

        // Verificador de permutação
        boolean ePermt = true;
        for (int i=0; i<n; i++){
            if (Linha[i] != 1 || Coluna[i] != 1){
                ePermt = false;
                break;
            }
        }

        if (ePermt){
            System.out.println("é uma matriz permutação");
        } else {
            System.out.println("não é uma matriz permutação");
        }
    }
}