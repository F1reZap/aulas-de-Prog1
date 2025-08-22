//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. (falha) preencher a matriz com random nn deu certo
//teste2. (funciona) fiz uma matriz pré preenchida e coloquei pra contar :)

import java.util.Random;
import java.util.Scanner;

//17. Uma rede social de amizades pode ser representada por uma matriz quadrada (mesmo número de linhas e
//colunas) de dimensão número de pessoas da rede social. A amizade entre as pessoas presentes nessa rede
//se dá da seguinte forma: suponha que n0, n1, n2... representa uma pessoa e, caso duas pessoas sejam
//amigas, então a posição da matriz será 1, caso contrário será 0 (zero). Considere a matriz de exemplo
//abaixo:
//Essa matriz representa uma rede social entre 5 pessoas: n0, n1, n2, n3 e n4. Além disso, quando a
//posição (i, j) da matriz é 1, então as pessoas ni e nj são amigas entre si. Caso a posição (i, j) da matriz é
//0, então ni e nj não são amigas. Observe que a pessoa n0 é amiga das pessoas n1, n2 e n4, mas não é
//amiga da pessoa n3. Importante: a relação de amizade é simétrica: se ni é amigo de nj, então nj é,
//necessariamente, amigo de ni. Além disso, em redes sociais de amizade, não existe amizade da pessoa
//com ela mesma. Sabendo disso, implemente um algoritmo que:
//a) preencha a matriz de amizades de uma rede social contendo 5 pessoas;
//b) calcule e imprima a quantidade de amigos que cada pessoa possui.

public class lista6 {
    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner teclado = new Scanner(System.in);
        int[][] matriz = {
                {0, 1, 1, 0, 1},
                {1, 0, 0, 1, 0},
                {1, 0, 0, 1, 1},
                {0, 1, 1, 0, 0},
                {1, 0, 1, 0, 0}
        };

        for (int i = 0; i <matriz.length; i++) {
            int qntAmg = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    qntAmg++;
                }
            }
            System.out.println("Pessoa n: "+i+". tem: "+qntAmg+". amigos."); //a realidade vai ser: pessoa n° tem 0 amigos
        }
    }
}