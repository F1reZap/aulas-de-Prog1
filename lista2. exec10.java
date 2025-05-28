//10. Uma pessoa depositou R$2000,00 em um fundo de investimento que rende 0.5% ao mês. Essa pessoa
//gostaria de saber qual o total acumulado após 2 anos. Faça um programa que forneça tais informações.
//(Obs. desconsidere correção monetária e utilize a fórmula de juros compostos)

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        double ren, val, mes, ano, result;
        //contas malditas
        val = 2000.00;
        ren = 0.005;
        mes = 24;
        ano = (val*ren)*mes;
        result = val+ano;
        System.out.println("O total acumulado foi de: " +result);
    }
}
