//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. (falhou) tentei usar uma matriz com string e 2 for pra preencher.
//teste2. (FALHOU) vetores separados pra corredor e pra janelas funcionam porem nn salva qual ta ocupado aaaaaaaaaaah
//teste3. quase 100 linhas 0.0 (falhou) tentei usar uma booleana para dar break caso ocupasse uma cadeira
//teste4. (funcionou) 120 linhas. tem menuzinho, tem confirmação de lugar, o mapa e atualizado toda vez.

import java.util.Scanner;

//14. Uma empresa de possui ônibus com 48 lugares (24 nas janelas e 24 no corredor). Faça um programa que
//utilize uma matriz para controlar as poltronas ocupadas no corredor e janela. Considere que 0 representa
//poltrona desocupada e 1, poltrona ocupada. Inicialmente, todas as poltronas estarão livres. Depois disso, o
//programa deverá apresentar as seguintes opções:
//========================================
//MARIAS UNIDAS
//========================================
//a. Vender passagem
//b. Mostrar mapa de ocupação do ônibus
//c. Encerrar
//========================================
//- Quando a opção escolhida for a letra ‘a’, deve-se verificar se o ônibus ainda possui poltronas a serem
//vendidas. Caso haja poltrona vazia, deve ser perguntado ao usuário qual poltrona o mesmo deseja
//ocupar. O programa deverá, então dar uma das seguintes mensagens: 1) Venda efetivada – se a
//poltrona solicitada estiver livre, marcando-a como ocupada; 2) Poltrona ocupada – se a poltrona
//solicitada não estiver disponível para venda.
//- Quando a opção escolhida for letra ‘b’, deverá ser mostrada uma listagem separando as poltronas da
//janela e corredor, o número da poltrona e se está livre ou ocupada.
//- Quando for escolhida a opção letra ‘c’, a execução do programa deverá ser finalizada
public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] janela = new int[24];
        int[] corredor = new int[24];

        boolean exe = true;

        while (exe) {
            System.out.println("a. comprar passagem");
            System.out.println("b. Mapa do ônibus");
            System.out.println("c. Encerrar");
            System.out.print("Opção: ");
            String op = teclado.nextLine().toLowerCase();

            switch (op) {
                case "a":
                    int livres = 0;
                    for (int i=0; i<24; i++) {
                        if (janela[i] == 0) livres++;
                        if (corredor[i] == 0) livres++;
                    }
                    if (livres == 0) {
                        System.out.println("Não há poltronas disponíveis.");
                        break;
                    }

                    System.out.print("Tipo de poltrona (janela/corredor): ");
                    String type =teclado.nextLine().toLowerCase();

                    if (!type.equals("janela") && !type.equals("corredor")) {
                        System.out.println("Tipo invalido.");
                        break;
                    }

                    System.out.print("N° da poltrona entre 1 e 24: ");
                    int num;
                    try {
                        num =Integer.parseInt(teclado.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("N° inválido.");
                        break;
                    }

                    if (num <1 || num >24) {
                        System.out.println("N° não esta no intervalo.");
                        break;
                    }

                    int idx= num -1;
                    if (type.equals("janela")) {
                        if (janela[idx]==0) {
                            janela[idx]=1;
                            System.out.println("Venda efetivada! Poltrona " + num + " (janela) ocupada.");
                            System.out.println("mande um pix de 10,00R$ para: (31)98217-2178. para confirmar sua compra"); //NÃO ENVIA FOI SÓ UMA PIADA
                        } else {
                            System.out.println("Poltrona ocupada!");
                        }
                    } else {
                        if (corredor[idx]==0) {
                            corredor[idx]=1;
                            System.out.println("Venda efetivada! Poltrona " + num + " (corredor) ocupada.");
                        } else {
                            System.out.println("Poltrona ocupada!");
                        }
                    }
                    break;

                case "b":
                    System.out.println("Mapa de ocupação do ônibus:");
                    System.out.println("Janela:");
                    for (int i=0; i<24; i++) {
                        System.out.println("Poltrona "+(i + 1)+": "+(janela[i]==0?"Livre":"Ocupada"));
                    }
                    System.out.println("Corredor:");
                    for (int i=0; i<24; i++) {
                        System.out.println("Poltrona "+(i + 1)+": "+(corredor[i]==0?"Livre" : "Ocupada"));
                    }
                    break;

                case "c":
                    System.out.println("Programa encerrado.");
                    exe =false;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }
}