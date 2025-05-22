//11. O salário de um funcionário pode ser calculado com base no número de horas normais e extras trabalhadas,
//além do valor atual do salário mínimo. Para isso, considere os seguintes critérios:
//a. O valor pago por hora trabalhada é 0.125 do salário mínimo;
//b. O valor pago por hora extra é 0.25 do salário mínimo;
//c. o salário bruto equivale ao número de horas normais trabalhadas vezes o valor pago por hora;
//d. a quantia a receber por horas extras equivale às horas extras realizadas multiplicado pelo valor pago
//por hora extra;
//e. o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.
//f. Assim sendo, crie um algoritmo que receba o número de horas normais, número de horas extras
//trabalhadas e o valor do salário mínimo atual. Após isso, calcule e mostre o salário final do
//funcionário

import java.util.Scanner;

public class fabinhojuninho {
    public static void main(String[] args) {
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
