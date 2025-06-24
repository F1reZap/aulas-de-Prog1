//17. Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente
import java.util.Scanner;

public class lista3 {

    public static void main(String[] args) {
        double valor, cod, qnt , totn, vf;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite qual produto e quantos você vai comprar: ");
        cod = teclado.nextDouble();
        qnt = teclado.nextDouble();

        if (cod>=1 && cod<=10){
            valor = 10;
            totn = qnt*valor;
            if (totn<=250){
                vf = totn-((totn/100)*5);
                System.out.println("O preço final é: "+vf+"R$");
            } else if (totn>250 && totn<500) {
                vf = totn-((totn/100)*10);
                System.out.println("O preço final é: "+vf+"R$");
            } else {
                vf = totn-((totn/100)*15);
                System.out.println("O preço final é: "+vf+"R$");
            }
        } else if (cod>=11 && cod<=20) {
            valor = 20;
            totn = qnt*valor;
            if (totn<=250){
                vf = totn-((totn/100)*5);
                System.out.println("O preço final é: "+vf+"R$");
            } else if (totn>250 && totn<500) {
                vf = totn-((totn/100)*10);
                System.out.println("O preço final é: "+vf+"R$");
            } else {
                vf = totn-((totn/100)*15);
                System.out.println("O preço final é: "+vf+"R$");
            }
        } else if (cod>=21 && cod<=30) {
            valor = 30;
            totn = qnt*valor;
            if (totn<=250){
                vf = totn-((totn/100)*5);
                System.out.println("O preço final é: "+vf+"R$");
            } else if (totn>250 && totn<500) {
                vf = totn-((totn/100)*10);
                System.out.println("O preço final é: "+vf+"R$");
            } else {
                vf = totn-((totn/100)*15);
                System.out.println("O preço final é: "+vf+"R$");
            }
        } else if (cod>=31 && cod<=40) {
            valor = 40;
            totn = qnt*valor;
            if (totn<=250){
                vf = totn-((totn/100)*5);
                System.out.println("O preço final é: "+vf+"R$");
            } else if (totn>250 && totn<500) {
                vf = totn-((totn/100)*10);
                System.out.println("O preço final é: "+vf+"R$");
            } else {
                vf = totn-((totn/100)*15);
                System.out.println("O preço final é: "+vf+"R$");
            }
        } else {
            System.out.println("Produto Inesistente");
        }


        teclado.close();
    }
}
