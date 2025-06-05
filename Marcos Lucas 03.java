//O custo de um carro novo ao consumidor é a soma do custo de fábrica, a porcentagem do distribuidor e os
//impostos. O valor pago pela distribuição e dos impostos é calculado com base no custo de fábrica. As
//porcentagens estão apresentadas na tabela abaixo. Faça um programa que receba o custo de fábrica de um
//carro e mostre o custo ao consumidor
import java.util.Scanner;


public class lista3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o Preço do Carro: ");
        double ValCar = teclado.nextDouble();

        if (ValCar < 28000.00){
            double car1 = ValCar+((ValCar/100)*5);
            System.out.println("menor que 28.000R$, Insento de Impostos. O Valor final do carro é: "+car1);
        } else if (ValCar >= 28000.00 && ValCar < 45000.00) {
            double car2 = ValCar+((ValCar/100)*10)+((ValCar/100)*15);
            System.out.println("Até 45.000R$ 15% de Impostos. O Valor final do carro é: "+car2);
        } else if (ValCar > 45000.00) {
            double car3 = ValCar+((ValCar/100)*15)+((ValCar/100)*20);
            System.out.println("Preço maior que 45.000R$ 20% de Impostos. O Valor final do carro é: "+car3);
        } else {
            System.out.println("COMO????????????????????????");
        }


        teclado.close();
    }
}
