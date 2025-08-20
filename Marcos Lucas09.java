//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. preenchimento de Matriz. (Funcionou)
//teste2. cheacando de a matriz tem numeros parecidos logo abaixo do numero inicial (falhou)
//teste3. coloquei uma booleana de é simetrica (falhou)
//teste4. tentei inverter o I e o J como coluna e linha pra ver se a booleana funciona (Funcionou)

import java.util.Random;
import java.util.Scanner;

//9. Faça um programa que carregue uma matriz 8 x 8 com números reias e mostre uma mensagem dizendo se
//a matriz é ou não simétrica. Uma matriz é simétrica se para todas as posições da mesma, tem-se a relação
//A[i][j] = A[j][i]

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[][] Matrix = new int[8][8];
        int prench;

        //for de preenchimento:
        for (int i = 0; i< Matrix.length; i++){
            for (int j = 0; j< Matrix[i].length; j++){
                prench = random.nextInt(0, 2);
                System.out.println(prench);
                Matrix[i][j] = prench;
//                System.out.println(".");
            }
        }
        // Meu Deus vou ter q usar booleana, ;-;
        boolean eSime = true;
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                if (Matrix[i][j] != Matrix[j][i]) {
                    eSime = false;
                    break;
                }
//                System.out.println(".");
            }
            if (!eSime) break;
        }
        if (eSime ==true) {
            System.out.println("matriz simétrica.");
        } else {
            System.out.println("matriz não simétrica.");
        }
    }
}
