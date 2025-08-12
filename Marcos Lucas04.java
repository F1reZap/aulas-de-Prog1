//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. Imprimir notas (falhou)
//teste2. calcular as medias (Funcionou)
//teste3. Teste final todos os sistemas juntos (Funcionou)


import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//4. Faça um programa que:
//● Receba as notas de 10 alunos em cinco provas diferentes e armazene-as em uma matriz 10 x 5.
//● Receba o nome dos 10 alunos e armazene-os em um vetor de string com 10 posições
//● Calcule e exiba o nome do aluno, a média das notas do mesmo e a situação:
//o Aprovado: média maior ou igual a 7
//o Reprovado: média menor que 4

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[][] Notas = new int[10][5];
        double[] Medias = new double[10];
        String[] alunos = new String[10];
        int prench;
        String nomes;
        double med1=0, medfinal=0;

        for (int i=0; i<Notas.length; i++){
            System.out.println("Nome do Aluno: ");
            nomes = teclado.nextLine();
            alunos[i] = nomes;
            for (int j=0; j<Notas[i].length; j++){
                System.out.println("Nota: ");
                prench = teclado.nextInt();
                Notas[i][j] = prench;
                med1+=prench;

            }
            medfinal = med1/5;
            Medias[i] = medfinal;
            teclado.nextLine();
        }
        for (int i=0; i<Medias.length; i++){
            if (Medias[i]>=7){
                System.out.println("Aluno: "+alunos[i]+". Aprovado");
            } else if (Medias[i]<4) {
                System.out.println("Aluno: "+alunos[i]+". Reprovado");
            }
        }
//        System.out.println(Notas);
//        System.out.println(Arrays.toString(alunos));
    }
}