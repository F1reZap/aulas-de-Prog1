//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. teste inicial pra ver se funciona vulgo rodar o código (funcionou de priMEIRAAAAAAAAJAJAHAHAHAHA)

import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

//6. Na teoria de sistemas define-se o elemento MINMAX de uma matriz como sendo o maior elemento da
//linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 x 7
//com números reias, calcule e mostre o MINMAX e sua posição (linha e coluna).

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[][] mat1 = new int[4][7];
        int prench, MINMAX=0, Min=0, linha=0, coluna=0;

        //for de preenchimento
        for (int i=0; i< mat1.length; i++){
            for (int j=0; j< mat1[i].length; j++){
                prench = random.nextInt(1, 999);
                mat1[i][j] = prench;
            }
        }
        //Hora de descobrir o maior e o menor >:)
        for (int i=0; i< mat1.length; i++){
            for (int j=0; j<mat1[i].length; j++){
                if (j==0){
                    Min= mat1[i][j];
                    MINMAX = mat1[i][j];
                    linha=i;
                } else {
                    if (mat1[i][j]< Min){
                        Min=mat1[i][j];
                        linha=i;
                        coluna=j;

                    } else {
//                        System.out.println(".");
                    }
                }
            }
        }
        for (int i=0; i< mat1.length; i++){
            for (int j=0; j< mat1[i].length; j++){
                if (i==linha){
                    if (MINMAX<mat1[i][j]){
                        MINMAX=mat1[i][j];
                    } else {
//                        System.out.println(".");
                    }
                }
            }
        }
        System.out.println("MinMax: "+MINMAX+". Minimo: "+Min+". Linha: "+linha+". Coluna: "+coluna);
    }
}