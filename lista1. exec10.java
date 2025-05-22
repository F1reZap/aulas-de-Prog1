//10.Painel de Bicicleta de Academia: As bicicletas ergométricas mais modernas possuem um painel que exibe
//informações como velocidade média e distância percorrida durante o exercício. Suponha que cada bicicleta
//possui uma roda de raio conhecido e que o sistema é capaz de contar o número de voltas que essa roda deu,
//além do tempo total do exercício (em segundos). Sabendo que a distância percorrida em uma volta
//completa é igual ao comprimento da circunferência da roda (C = 2 × π × raio), faça um algoritmo que:
//Receba o raio da roda (em metros); Receba a quantidade de voltas completas dadas pela roda; Receba o
//tempo total do exercício (em segundos); Calcule e mostre: A distância percorrida (em metros); A
//velocidade média (em km por hora). Use π = 3,14.

import java.util.Scanner;

public class fabinhojuninho {
    public static void main(String[] args) {
        double ai, pi, R, c, ms, kmh, t ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos que você usou a bicicleta: ");
        ai = teclado.nextDouble();
        System.out.println("Digite o Raio da Roda em Metros: ");
        R = teclado.nextDouble();
        //Contas malditas
        pi = 3.14;
        c = 2*pi*R;
        ms = c/ai;
        kmh = ms*3.6;

        System.out.println("você percorreu: "+ms+" Metros, em: " +ai+" segundos");
    }

}
