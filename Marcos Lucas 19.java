//19.Faça um algoritmo que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre:

import java.util.Scanner;

public class lista319 {
    public static void main(String[] args) {

        double imp, Grat, SalF;
        Scanner teclado = new Scanner(System.in);
        System.out.println("tempo de serviço: ");
        double temserv = teclado.nextInt();
        System.out.println("Salário Base: ");
        double SalB = teclado.nextInt();
        imp = 0;
        Grat = 0;

        if (SalB< 200){
            imp = 0;
        } else if (SalB>=200 && SalB<450) {
            imp = (SalB/100)*3;
        } else if (SalB>=450 && SalB<700) {
            imp = (SalB/100)*8;
        } else if (SalB >=700) {
            imp = (SalB/100)*12;
        } else {
            System.out.println("COMO??????????????????");
        }

        if (SalB>500){
            if (temserv<=3){
                Grat = 20;
            } else if (temserv>3) {
                Grat = 30;
            } else {
                System.out.println("COMO??????????");
            }
        } else if (SalB <=500) {
            if (temserv<=3){
                Grat = 23;
            } else if (temserv>3 && temserv<6) {
                Grat = 35;
            } else if (temserv>=6) {
                Grat = 33;
            } else {
                System.out.println("SERIO A ESSA ALTURA EU NEM QUERO SABER COMO SÓ QUERO SABER O PORQUE ALGUEM CHEGARIA AQUI?");
            }
        }

        System.out.println(+imp);
        System.out.println(+Grat);

        SalF = SalB-imp+Grat;
        if (SalF<=350){
            System.out.println("A");
        } else if (SalF>350 && SalF<600) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        teclado.close();
    }
}
