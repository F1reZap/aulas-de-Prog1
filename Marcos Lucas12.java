//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. preenchimento (funciona)
//teste2. a) (funcionou após 3 tentativas) 5 totais
//teste3. b,c) (funcionaram após 5 tentativas) 8 totais
//teste4. d) e final (funcionou) 9 tentativas totais B)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//12Faça um programa que receba o estoque atual de 3 produtos que estão armazenados em 4 armazéns e
//coloque esses dados em uma matriz 5 x 3. Sendo que a última linha da matriz contém o custo de
//estocagem de uma unidade de cada produto, calcule e mostre:
//a) Quantidade de itens armazenados em cada armazém;
//b) Qual armazém possui maior estoque do produto 2;
//c) Qual armazém possui menor estoque;
//d) Qual armazém possui maior custo de estocagem..

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[][] produt = new int[5][3];

        //for de preenchimento
        for (int i=0; i< produt.length; i++){
            if (i!=5){
                for (int j=0; j< produt[i].length; j++){
                    produt[i][j]=random.nextInt(100);
                }
            } else {
                for (int j=0; j< produt[i].length; j++){
                    produt[i][j]= random.nextInt(10);
                }
            }
        }
        //(a)
        int[] soma = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i] += produt[i][j];
            }
        }
        System.out.println(Arrays.toString(soma));
        //(b)
        int maior=0;
        for (int i=0; i<4; i++){
            for (int j=0; j<3; j++){
                if (i==0 && j==2){
                    maior=i;
                } else {
                    if (produt[i][2]>produt[maior][2]){
                        maior=i;
                    }
                }
            }
        }
        System.out.println("O armazém: "+maior+". possui a maior quantidade do produto 2");
        //(c)
        int menor=0, armaz=0;
        for (int i = 0; i < 4; i++) {
            if (i==0){
                armaz=soma[i];
                menor=i;
            } else if (soma[i]<armaz) {
                armaz=soma[i];
                menor=i;
            }
        }
        System.out.println("O armazem: "+menor+". tem o menor estoque");
        //(d)
        int maiCusto = 0;
        int armzMaiCusto = 0;
        for (int i=0; i<4; i++) {
            int custo=0;
            for (int j=0; j<3; j++) {
                custo +=produt[i][j]*produt[4][j];
            }
            if (i==0 || custo>maiCusto) {
                maiCusto=custo;
                armzMaiCusto=i;
            }
        }
        System.out.println("O armazem: "+armzMaiCusto+". tem o maior custo de estocagem: "+maiCusto);
    }
}