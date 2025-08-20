//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. a, b) (obviamente funcionou literalmente é receber e botar .lenght)
//teste2. c) (funcionou)
//teste3. d) (funcionou) .equal o GOAT

import java.util.Scanner;

//13. faça um programa que leia o nome completo e o apelido de uma pessoa. Imprima: a) quantidade de
//caracteres no nome completo da pessoa; b) Concatene o apelido ao nome do usuário; c) Verifique se o
//nome do usuário é igual ao seu apelido. Funções da biblioteca string: strcmp, strcat, strlen.

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // a)
        System.out.print("Digite o nome completo: ");
        String nomeComplt = teclado.nextLine();

        System.out.print("Digite o apelido: ");
        String apelido = teclado.nextLine();

        // b)
        int qntChar = nomeComplt.length();
        System.out.println("Quantidade de caracteres no nome completo: " + qntChar);

        // c)
        String nomeConcat = nomeComplt + " " + apelido;
        System.out.println("Nome completo + apelido: " + nomeConcat);

        // d)
        if (nomeComplt.equals(apelido)) {
            System.out.println("O nome completo é igual ao apelido.");
        } else {
            System.out.println("O nome completo é diferente do apelido.");
        }

        teclado.close();
    }
//    public static void main(String[] args) {
//        Scanner teclado = new Scanner(System.in);
//        Random random = new Random();
//
//        int[][] produt = new int[5][3];
//
//        //for de preenchimento
//        for (int i=0; i<produt.lenght; i++){
//
//        }
//
//    }
}