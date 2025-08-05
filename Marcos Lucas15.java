import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class lista5 {
//    static Scanner teclado = new Scanner(System.in);
//    public static void preencheVetor (int v[]){
//        for (int i =0; i< v.length;i++){
//            System.out.println("Digite o código da sua conta: ");
//            v[i] = teclado.nextInt();
//        }
//    }
//    public static void preencheVetor (double v[]){
//        for (int i =0; i< v.length;i++){
//            System.out.println("Digite o saldo da sua conta: ");
//            v[i] = teclado.nextDouble();
//        }
//    }
    public static void main(String[] args) {
        int contas[] = new int[10], CC=0;
        int saldo[] = new int[10];
        int BB=0, check, save=0, deposito, saque;
        int escolha = 0;
        boolean existe = false;

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i< contas.length; i++){
            CC = random.nextInt(001, 999);
            contas[i] = CC;
            BB = random.nextInt(-1500, 100000);
            saldo[i] = BB;
        }
        System.out.println(Arrays.toString(contas));
//        System.out.println(Arrays.toString(saldo));
        do {
            System.out.println("Digite o código da sua conta: ");
            check = teclado.nextInt();
            for (int i=0;i<contas.length;i++){
                if (check==contas[i]){
                    save=i;
                    existe=true;
                    i = contas.length;
                } else {
                    System.out.println(".");

                }
            }
        } while (existe!=true);
        if (existe==true){
            do {

                if (existe==true){
                    System.out.println("Menu de operações");
                    System.out.println("1. Efetuar depositos");
                    System.out.println("2. Efetuar saque");
                    System.out.println("3. consultar saldo em conta");
                    System.out.println("4. finalizar");
                    System.out.println("operação a ser realizada: ");
                    escolha = teclado.nextInt();

                    if (escolha==1){
                        System.out.println("Valor a Depositar: ");
                        deposito = teclado.nextInt();
                        saldo[save] = saldo[save]+deposito;
                        System.out.println("Deposite o valor em: (31) 98217-2178. para ver o seu novo saldo");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");

                    } else if (escolha==2) {
                        System.out.println("valor a sacar: ");
                        saque = teclado.nextInt();
                        if (saldo[save]<saque){
                            System.out.println("Valor Impossivel de sacar devido a vc não ter dinheiro");
                        } else {
                            saldo[save] = saldo[save]-saque;
                        }
                    } else if (escolha==3) {
                        System.out.println("O seu Saldo é: "+saldo[save]+" R$");
                    }
                } else {
                    System.out.println("Conta Inexistente");
                    return;
                }

            }while (escolha!=4);
        } else {
            System.out.println("crybaby");
        }
    }
}