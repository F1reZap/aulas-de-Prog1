//17. Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente
import java.util.Scanner;

public class lista3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite três numeros: ");
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        
        if (a>b && b>c){
            System.out.println("A ordem crescente é:"+c+ ", "+b+ ", "+a);
            System.out.println("A ordem decrescente é:"+a+ ", "+b+ ", "+c);
        } else if (a<b && b<c) {
            System.out.println("A ordem crescente é:"+a+ ", "+b+ ", "+c);
            System.out.println("A ordem decrescente é:"+c+ ", "+b+ ", "+a);
        } else if (a>c && c>b) {
            System.out.println("A ordem crescente é:"+b+ ", "+c+ ", "+a);
            System.out.println("A ordem decrescente é:"+a+ ", "+c+ ", "+b);
        } else if (a<c && c<b) {
            System.out.println("A ordem crescente é:"+a+ ", "+c+ ", "+b);
            System.out.println("A ordem decrescente é:"+b+ ", "+c+ ", "+a);
        } else if (b>a && a>c) {
            System.out.println("A ordem crescente é:"+c+ ", "+a+ ", "+b);
            System.out.println("A ordem decrescente é:"+b+ ", "+a+ ", "+c);            
        } else if (b<a && a<c) {
            System.out.println("A ordem crescente é:"+b+ ", "+a+ ", "+c);
            System.out.println("A ordem decrescente é:"+c+ ", "+a+ ", "+b);
        } else if (b>c && c>a) {
            System.out.println("A ordem crescente é:"+a+ ", "+c+ ", "+b);
            System.out.println("A ordem decrescente é:"+b+ ", "+c+ ", "+a);
        } else if (b<c && c<a) {
            System.out.println("A ordem crescente é:" + b + ", " + c + ", " + a);
            System.out.println("A ordem decrescente é:" + a + ", " + c + ", " + b);
        } else if (c>a && a>b) {
            System.out.println("A ordem crescente é:" + b + ", " + a + ", " + c);
            System.out.println("A ordem decrescente é:" + c + ", " + a + ", " + b);
        } else if (c<a && a<b) {
            System.out.println("A ordem crescente é:" + c + ", " + a + ", " + b);
            System.out.println("A ordem decrescente é:" + b + ", " + a + ", " + c);
        } else if (c>b && b>a) {
            System.out.println("A ordem crescente é:"+a+ ", "+b+ ", "+c);
            System.out.println("A ordem decrescente é:"+c+ ", "+b+ ", "+a);
        } else if (c<b && b<a) {
            System.out.println("A ordem crescente é:"+c+ ", "+b+ ", "+a);
            System.out.println("A ordem decrescente é:"+a+ ", "+b+ ", "+c);
        } else {
            System.out.println("Rapaiz eesse else deve ser ez de chegar slc");
        }


        teclado.close();
    }
}
