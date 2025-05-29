//16.Faça um algoritmo que receba uma quantidade qualquer em minutos e converta em horas e minutos (utilize
//divisão inteira e resto da divisão inteira).

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        double A, Min;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seus minutos: ");
        Min = teclado.nextDouble();
        //contas malditas
        A = Min/60;
        System.out.format("isso são %.2f horas", A);
    }
}
