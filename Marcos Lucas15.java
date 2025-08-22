//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. (funcionou) usei matriz e vetor pra calcular o total é incrivel oq café nn faz com o cérebro do caba

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//14. O gerente salão de beleza Maria Saliente tem uma tabela em que registra os serviços realizados por suas
//5 manicures. Os serviços realizados pelas mesmas são: “unha dos pés”, “unhas das mãos” e serviço de
//podologia. Como nenhuma das 5 manicures possuem carteira assinada, elas ganham 50% do que faturou
//ao mês. Crie um algoritmo que faça o controle, calcule e imprima quanto cada uma vai receber por cada
//tipo de serviço prestado. Os valores pagos para cada serviço são, respectivamente, R$ 10,00; R$ 15,00 e
//R$ 30,00.

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[][] Maria = new int[5][3];
        int[] UP = new int[5];
        int[] UM = new int[5];
        int[] PDL = new int[5];
        int Soma=0;

        for (int i=0; i< Maria.length; i++){
            for (int j = 0; j < Maria[i].length; j++){
                Maria[i][j]= random.nextInt(0, 100);
            }
        }

        for (int i=0; i< Maria.length; i++){
            //UP
            UP[i] = (Maria[i][0]*10)/50;
        }
        for (int i=0; i< Maria.length; i++){
            //UM
            UM[i] = (Maria[i][1]*15)/50;
        }
        for (int i=0; i< Maria.length; i++){
            //PDL
            PDL[i] = (Maria[i][0]*30)/50;
        }
        for (int i=0; i< Maria.length; i++){
            System.out.println("manicure: "+(i+1));
            System.out.println("Unha do pé: "+UP[i]+" R$");
            System.out.println("Unha da mão: "+UM[i]+" R$");
            System.out.println("Podologia: "+PDL[i]+" R$");
            System.out.println("---");
        }
    }
}