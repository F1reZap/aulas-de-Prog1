//4. Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois
//números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / '
//divisão. Lembre-se das condições para realizar a divisão (condicional aninhada).
import java.util.Scanner;


public class lista3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("qual operação (Soma = 1)(Subtração = 2)(Multiplicação = 3)(Divisão = 4): ");
        double OP = teclado.nextDouble();
        System.out.println("Digite o Primeiro Numero: ");
        double N1 = teclado.nextDouble();
        System.out.println("Digite o Segundo Numero: ");
        double N2 = teclado.nextDouble();

        if (OP == 1){
            double Sum = N1+N2;
            System.out.println("= "+Sum);
        } else if (OP == 2) {
            double Sub = N1-N2;
            System.out.println("= "+Sub);
        } else if (OP == 3) {
            double Mul = N1*N2;
            System.out.println("= "+Mul);
        } else if (OP == 4) {
            if (N1 != 0){
                if (N2 !=0){
                    double Div = N1/N2;
                    System.out.println("= "+Div);
                } else {
                    System.out.println("Divisão por 0. impossivel");
                }
            } else {
                System.out.println("Divisão por 0. impossivel");
            }
        } else {
            System.out.println("Reinicie o Código e leia a primeira linha");
        }


        teclado.close();
    }
}
