//1.Faça um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Faça os testes
//necessários em relação a idade inválida.

import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double X = teclado.nextDouble();

        if (X%2==0){
            System.out.println("é Par");
        } else {
            System.out.println("é Impar");
        }
        teclado.close();
    }
}
