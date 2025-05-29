//19. Implemente m programa que receba um número positivo, calcule e mostre:
// O número digitado elevado ao quadrado;
// O número digitado elevado ao cubo;
// A raiz quadrada do número;
// A raiz cúbica do número.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        double HP, HE, SM0, Sb, SM1, SM2, HX1, HX2, HX3, rec ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite quantas horas vc trabalha normalmente: ");
        HP = teclado.nextDouble();
        System.out.println("Digite quantas horas extra vc fez: ");
        HE = teclado.nextDouble();
        SM0 = 1518;
        //Contas malditas
        SM1 = SM0/100;
        SM2 = SM1*12.5;
        HX1 = SM0/100;
        HX2 = HX1*25;
        HX3 = HE*HX2;
        Sb = HP*SM2;
        rec = Sb+HX3;



        System.out.println("você deve receber: "+rec+"R$.");
    }
}
