import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        int a, b, ql=0;
        double soma, subt, mult, div;
        Scanner teclado = new Scanner(System.in);

        while (ql!=5){
            System.out.println("Calculadora de marcos");
            System.out.println("1-Soma");
            System.out.println("2-Subtração");
            System.out.println("3-Multiplicação");
            System.out.println("4-Divisão");
            System.out.println("5-Sair");
            System.out.println("Escolha:");
            ql = teclado.nextInt();
            if (ql == 5){
                System.out.println("Encerrando");

            } else if (ql == 1) {
                System.out.println("Digite 2 numeros");
                a = teclado.nextInt();
                b = teclado.nextInt();
                soma = a+b;
                System.out.println(soma);
            } else if (ql == 2) {
                System.out.println("Digite 2 numeros");
                a = teclado.nextInt();
                b = teclado.nextInt();
                subt = a-b;
                System.out.println(subt);
            } else if (ql == 3) {
                System.out.println("Digite 2 numeros");
                a = teclado.nextInt();
                b = teclado.nextInt();
                mult = a * b;
                System.out.println(mult);
            } else if (ql == 4) {
                System.out.println("Digite 2 numeros");
                a = teclado.nextInt();
                b = teclado.nextInt();
                if (b!=0){
                    mult = a / b;
                    System.out.println(mult);
                }
                else {
                    System.out.println("divisão por 0, impossivel");
                }
            } else {
                System.out.println("pare de usar drogas, e lêia o menu");
                
            }
        }

        teclado.close();
    }
}