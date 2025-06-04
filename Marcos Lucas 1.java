//1.Faça um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Faça os testes
//necessários em relação a idade inválida.

import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a Sua Idade: ");
        double ID = teclado.nextDouble();

        if (ID<4){
            System.out.println("Menor que 4 anos.");
        } else if (ID >= 4 && ID<=7) {
            System.out.println("Categoria Infantil");
        } else if (ID >= 8 && ID<=10) {
            System.out.println("Categoria Juvenil");
        } else if (ID >= 11 && ID<=15) {
            System.out.println("Categoria Adolescente");
        } else if (ID >= 16 && ID<=40) {
            System.out.println("Categoria Adulto");
        } else if (ID > 40) {
            System.out.println("Categoria Sênior ");
        } else {
            System.out.println("COMO?");
        }
        teclado.close();
    }
}
