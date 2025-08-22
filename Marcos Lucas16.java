//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. (falha) nem sei explicar oq ta acontecendo mais, era pra matriz cadastrar usando o maior numero e nn foi
//teste2. (falha) ta segundo o diogo eu posso separar em varios statics (nn aguento mais documentar meus codigos ;-;), enfim mesmas falhas no cadastro, vou temntar static por static.
//teste3. (funciona) aparentemenre varias PSVM é a solução pra todos os problemas da modernidade

import java.util.Scanner;

//16. Uma floricultura conhecedora de sua clientela gostaria de fazer um algoritmo que pudesse controlar
//sempre um estoque mínimo de determinadas plantas, pois todos os dias, pela manhã, o dono faz novas
//aquisições. Crie um algoritmo que possua as seguintes opções:
//==========================================
//FLORICULTURA MARIASFLOR
//==========================================
//1. CADASTRAR NOVA PLANTA
//2. RETIRAR PLANTA
//3. INSERIR PLANTA
//4. IMPRIMIR RELATÓRIO
//5. SAIR
//===========================================
//O algoritmo deve permitir o cadastro de 50 tipos de plantas. Na opção de cadastro, para cada planta, o
//algoritmo deve cadastrar um código (inteiro), o nome (string), o estoque ideal e a quantidade atual em
//estoque. Na opção retirar planta, o sistema deve permitir a retirada do estoque atual de uma planta,
//dado o código digitado pelo usuário, lembre-se de verificar se o estoque é suficiente para atender o
//pedido. Para a opção de inserção, seu algoritmo deve atualizar o estoque atual de uma certa planta,
//dadas as informações de quantidade comprada e do código da planta que são digitadas pelo usuário.
//Na opção de imprimir relatório, seu algoritmo deve imprimir os nomes, os estoques atuais e as
//quantidades a serem compradas das plantas que possuem estoque abaixo do ideal.

public class lista6 {
    static final int MAX_PLANTAS = 50;
    static int qtdPlantas = 0;
    static Planta[] plantas = new Planta[MAX_PLANTAS];

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("FLORICULTURA MARIASFLOR");
            System.out.println("1. CADASTRAR NOVA PLANTA");
            System.out.println("2. RETIRAR PLANTA");
            System.out.println("3. INSERIR PLANTA");
            System.out.println("4. IMPRIMIR RELATÓRIO");
            System.out.println("5. SAIR");
            System.out.println("....................................................................");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPlanta(teclado);
                    break;
                case 2:
                    retirarPlanta(teclado);
                    break;
                case 3:
                    inserirPlanta(teclado);
                    break;
                case 4:
                    imprimirRelatorio();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    static void cadastrarPlanta(Scanner teclado) {
        if (qtdPlantas >= MAX_PLANTAS) {
            System.out.println("Limite de plantas atingido.");
            return;
        }
        System.out.print("Código da planta: ");
        int cod = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Nome da planta: ");
        String nome = teclado.nextLine();
        System.out.print("Estoque ideal: ");
        int estoqueIdeal = teclado.nextInt();
        System.out.print("Quantidade atual: ");
        int quantidadeAtual = teclado.nextInt();

        plantas[qtdPlantas++] = new Planta(cod, nome, estoqueIdeal, quantidadeAtual);
        System.out.println("Planta cadastrada com sucesso!");
    }

    static void retirarPlanta(Scanner teclado) {
        System.out.print("Digite o código da planta para retirar: ");
        int cod = teclado.nextInt();
        Planta p = buscarPlantaPorCodigo(cod);
        if (p != null) {
            System.out.print("Quantidade a retirar: ");
            int q = teclado.nextInt();
            if (q <= p.qntAtual) {
                p.qntAtual -= q;
                System.out.println("Retirada realizada.");
            } else {
                System.out.println("Estoque insuficiente.");
            }
        } else {
            System.out.println("Planta não encontrada.");
        }
    }

    static void inserirPlanta(Scanner teclado) {
        System.out.print("Digite o código da planta para inserir: ");
        int cod= teclado.nextInt();
        Planta p = buscarPlantaPorCodigo(cod);
        if (p != null) {
            System.out.print("Quantidade a inserir: ");
            int q = teclado.nextInt();
            p.qntAtual += q;
            System.out.println("Estoque atualizado.");
        } else {
            System.out.println("Planta não encontrada.");
        }
    }

    static void imprimirRelatorio() {
        System.out.println("Relatório de plantas abaixo do estoque ideal:");
        for (int i = 0; i < qtdPlantas; i++) {
            Planta p = plantas[i];
            if (p.qntAtual < p.estqIdeal) {
                System.out.println("Nome: " + p.nome +
                        ", Estoque atual: " + p.qntAtual +
                        ", Quantidade a comprar: " + (p.estqIdeal - p.qntAtual));
            }
        }
    }

    static Planta buscarPlantaPorCodigo(int cod) {
        for (int i = 0; i < qtdPlantas; i++) {
            if (plantas[i].cod == cod) return plantas[i];
        }
        return null;
    }
}

class Planta {
    int cod;
    String nome;
    int estqIdeal;
    int qntAtual;

    Planta(int cod, String nome, int estqIdeal, int qntAtual) {
        this.cod = cod;
        this.nome = nome;
        this.estqIdeal = estqIdeal;
        this.qntAtual = qntAtual;
    }
}