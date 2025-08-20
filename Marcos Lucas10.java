//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. preencher matriz (funcionou)
import java.util.Random;
import java.util.Scanner;

//10. Os elementos aij de uma matriz An x n representam os custos de transporte da cidade i para a cidade j. O
//caminhão de uma empresa de logística deve passar exatamente uma vez por cada uma da n cidades.
//Sabendo que, uma rota é representada por um vetor de n posições, em que cada posição representa a
//cidade visitada, você deve implementar um algoritmo que calcule o custo da rota de um caminhão da
//empresa. Note que, a rota e a matriz de custo devem ser fornecidas pelo usuário.
//Exemplo: Considere 4 cidades em que os custos de transporte entre as mesmas são representados pela
//matriz de custo M abaixo. Considere ainda uma rota denotada pelo vetor = [ 3 1 0 2] significando que
//o caminhão parte da cidade 3 com destino à cidade 1; sai de 1 e vai para 0; e por fim parte da cidade 0
//para a cidade 2. Portanto, o custo de transporte dessa rota é: M[3][1] + M[1][0] + M[0][2] = 19 + 15 + 16
//= 50 unidades.
//Matriz de custos M =
//[0 10 16 20
//15 0 25 18
//12 14 0 20
//20 19 35 0]
public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //N° cidades
        System.out.print("número de cidades: ");
        int n = teclado.nextInt();
        int[][] Custos = new int[n][n];

        //matriz de custos
        System.out.println("matriz de custos ("+n+"x"+n+"):");
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("Custo de "+i+" para "+j+": ");
                Custos[i][j]=teclado.nextInt();
            }
        }

        //rota do caminhão
        int[] rota = new int[n];
        System.out.println("Digite a rota do caminhão (sequência de "+n+" cidades):");
        for (int i=0; i<n; i++) {
            System.out.print("Cidade "+(i+1)+" da rota: ");
            rota[i]=teclado.nextInt();
        }

        // Calculum
        int custoTotal=0;
        for (int i=0; i<n-1; i++) {
            int cidadeOrigem = rota[i];
            int cidadeDestino = rota[i + 1];
            custoTotal +=Custos[cidadeOrigem][cidadeDestino];
        }

        System.out.println("Custo total da rota: "+custoTotal+" unidades.");

        teclado.close();
    }
}