//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. Digite N : 3
//Digite M : 3
//S
//teste2. Digite N : 4
//Digite M : 5
//S
//teste3. Digite N : 100
//Digite M : 10
//N

import java.util.Random;
import java.util.Scanner;

//20.  Joãozinho está aprendendo sobre matrizes. Hoje ele aprendeu como deixar matrizes na forma escada, e
//está exercitando. Para ajudá-lo, você deve escrever um programa que determine se o resultado dele realmente
//está no formato correto. Uma matriz está na forma escada quando, para cada linha, as condições a seguir
//forem satisfeitas:
//- Se a linha só possuir zeros, então todas as linhas abaixo desta também só possuem zeros.
//- Caso contrário, seja X o elemento diferente de zero mais à esquerda da linha; então, para todas as
//linhas abaixo da linha de X, todos os elementos nas colunas à esquerda de X e na coluna de X são
//iguais a zero.
//ENTRADA: A primeira linha possui dois inteiros N e M, as dimensões da matriz. Cada uma das N linhas
//seguintes contém M inteiros não-negativos, os elementos da matriz.
//SAÍDA: Seu programa deve produzir uma única linha, contendo o caractere ‘S’ caso a matriz esteja no
//formato escada, ou ‘N’, caso contrário.

public class lista6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite N : ");
        int N = teclado.nextInt();
        System.out.print("Digite M : ");
        int M = teclado.nextInt();

        int[][] matrix = new int[N][M];
        boolean escd = true;
        int LmtCl = 0;

        //for de preenchimento O RETORNO
        for (int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = random.nextInt(0,10);
            }
        }

        for (int i=0; i<N; i++) {
            int prN0 = -1;
            for (int j=0; j<M; j++) {
                if (matrix[i][j] != 0) {
                    prN0 = j;
                    break;
                }
            }

            if (prN0 == -1) {
                LmtCl = M;
            } else {
                for (int j=0; j<LmtCl; j++) {
                    if (matrix[i][j] != 0) {
                        escd = false;
                        break;
                    }
                }
                LmtCl = prN0;
            }

            if (!escd) break;
        }

        System.out.println(escd ? "S" : "N");
    }
}