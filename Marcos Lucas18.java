import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int N;
        int SumPar = 0, SumImp = 0, CunPar = 0, CunImp = 0;
        int maiorPar = Integer.MIN_VALUE;
        int menorImpar = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            N = teclado.nextInt();

            if (N < 0) {
                break;
            }

            if (N % 2 == 0) {
                SumPar += N;
                CunPar++;
                if (N > maiorPar) {
                    maiorPar = N;
                }
            } else {
                SumImp += N;
                CunImp++;
                if (N < menorImpar) {
                    menorImpar = N;
                }
            }
        }


        if (CunPar > 0) {
            System.out.println("Maior par: " +maiorPar+ "Média pares: " +(SumPar / (double) CunPar));
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        if (CunImp > 0) {
            System.out.println("Menor ímpar: " +menorImpar+ "Média  ímpares: " +(SumImp / (double) CunImp));
        } else {
            System.out.println("Nenhum número ímpar foi digitado.");
        }
    }
}