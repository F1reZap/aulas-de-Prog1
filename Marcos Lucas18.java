//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. (funcionou) N° rodadas: 8 = xerxes venceu
//teste2. (funcionou) N° rodadas: 100 = xerxes venceu
//teste3. (funcionou) N° rodadas: 501 = xerxes venceu
//teste4. (funcionou) N° rodadas: 7 = dario venceu (caba ruim de jogo)

import java.util.Random;
import java.util.Scanner;

//18.  brincadeira da Pedra, Papel e Tesoura, muita gente conhece. Mas dá para fazer uma mais legal
//com cinco opções e não só três! Dois jogadores, dario e xerxes, jogam uma partida com N rodadas. Em
//cada rodada os jogadores escolhem uma "mão" entre cinco opções, que vamos representar aqui com os
//números 0, 1, 2, 3 e 4. A figura define exatamente quem ganha a rodada. Por exemplo,
//se dario escolheu 0 e xerxes escolheu 3, então xerxes ganha a rodada, pois existe uma seta na figura
//indo de 3 para 0.
//Depois de N rodadas, o vencedor da partida é o jogador que ganhou mais rodadas. O número N será
//sempre ímpar, para não haver empate na partida. Vamos também considerar que os jogadores nunca
//escolhem a mesma mão numa rodada, para não haver empate na rodada. Você deve escrever um
//programa que determine quem venceu a partida, se foi dario ou xerxes.
//ENTRADA: primeira linha da entrada contém um inteiro N, o número de rodadas na partida. Cada
//uma das N linhas seguintes contém dois inteiros D e X, representando a mão que os
//jogadores dario e xerxes, respectivamente, jogaram em uma rodada.
//SAÍDA: Seu programa deve imprimir uma linha contendo o nome do jogador que venceu a
//partida: dario ou xerxes. Todas as letras devem ser minúsculas, sem nenhum acento!

public class lista6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("N° rodadas");
        int n = teclado.nextInt();

        int ptsDario=0, ptsXerxes=0, resultado=0;

        for (int i=0; i<n; i++) {
            int d = random.nextInt(0,5);
            int x = random.nextInt(0,5);
            resultado=(d-x+5)%5;

            if (resultado==1 || resultado==2) {
                ptsDario++;
            } else {
                ptsXerxes++;
            }
        }

        if (ptsDario > ptsXerxes) {
            System.out.println("dario venceu");
        }
        else {
            System.out.println("xerxes venceu");
        }
    }
}