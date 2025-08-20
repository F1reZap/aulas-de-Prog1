//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. preenchimento da matriz (Funcionou) shoo garaná edino
//teste2. a) (funcinou após 3 tentativas)
//teste3. b,c) (funcinou) teste realizado: matriz 5, cidade observada: 4
//teste4. d) e final (funcionou)


import java.util.Random;
import java.util.Scanner;

//11. Considere n cidades numeradas de 0 a n-1 que estão interligadas por uma série de estradas de mão única.
//As ligações entre as cidades são representadas pelos elementos de uma matriz quadrada Lnxn, cujos
//elementos lij assumem o valor 1 ou 0, conforme exista ou não estrada direta que saia da cidade i e chegue
//à cidade j. Assim, os elementos da linha i indicam as estradas que saem da cidade i, e os elementos da coluna j indicam as estradas que chegam à cidade j. Por convenção lii = 1. A figura abaixo um exemplo
//para n = 4.
//a) Dada uma cidade k, determine quantas estradas saem de k e quantas cidades chegam à k.
//b) Qual das cidades possuem maior número de estradas chegando?
//c) Encontre, se existirem, as cidades isoladas. Ou seja, aquelas em que não chegam nem saem estradas.
//d) Dada uma determinada rota de m cidades, representada por um vetor de inteiros cujos valores estão
//entre 0 e n-1, tal como exercício anterior, verifique se é possível realizar tal rota. No exemplo anterior,
//a rota (m = 5) 2 3 2 1 0 é impossível; já a rota (m = 6) 0 1 2 3 2 0 é possível.

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //numero de cidades
        System.out.print("número de cidades: ");
        int ncid = teclado.nextInt();

        int[][] L = new int[ncid][ncid];

        //for de preenchimento (vlw Dio pela dica de parar de Usar uma variavel pra preencher)
        for (int i=0; i<ncid; i++) {
            for (int j=0; j<ncid; j++) {
                if (i==j) {
                    L[i][j] = 1;
                } else {
                    L[i][j] = random.nextInt(2);
                }
            }
        }

        //S.o.pln
        System.out.println("Matriz de estradas:");
        for (int i = 0; i < ncid; i++) {
            for (int j = 0; j < ncid; j++) {
                System.out.println(L[i][j]);
            }
        }

        //a)
        System.out.println("Cidade em K: ");
        int k=teclado.nextInt();
        int saiDeK=0, chegaEmK=0;
        for (int j=0; j<ncid; j++) {
            if (L[k][j] == 1) saiDeK++;
            if (L[j][k] == 1) chegaEmK++;
        }
        System.out.println("Saem de k: "+saiDeK+", Chegam em k: "+chegaEmK);
        System.out.println(saiDeK+" estradas saem de K. "+chegaEmK+" estradas chegam em K");

        //b)
        int maxChg = 0, cidMax = 0;
        for (int col=0; col<ncid; col++) {
            int chegada = 0;
            for (int lin=0; lin<ncid; lin++) {
                if (L[lin][col] == 1) chegada++;
            }
            if (chegada > maxChg) {
                maxChg=chegada;
                cidMax=col;
            }
        }
        System.out.println("Cidade com +N° de estradas chegando: " + cidMax);

        //c)
        System.out.println("Cidades isoladas: ");
        for (int i=0; i<ncid; i++) {
            int sai=0, chega=0;
            for (int j=0; j<ncid; j++) {
                if (L[i][j] == 1) sai++;
                if (L[j][i] == 1) chega++;
            }
            if (sai==0 && chega==0) {
                System.out.print(i + ".");
            }
        }
        System.out.println();

        //d)
        System.out.println("tamanho da rota: ");
        int m = teclado.nextInt();
        int[] rota = new int[m];
        System.out.println("Informe a rota (m números de 0 a n-1): ");
        for (int i=0; i<m; i++) {
            rota[i] = teclado.nextInt();
        }
        boolean possivel = true;
        for (int i=0; i<m-1; i++) {
            if (L[rota[i]][rota[i+1]] != 1) {
                possivel = false;
                break;
            }
        }
        if (possivel) {
            System.out.println("rota possível!");
        } else {
            System.out.println("rota impossível!");
        }
    }
}