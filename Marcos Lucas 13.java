//13. Faça um programa que recebe de entrada três valores. Verificar se esses valores podem formar um
//triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo é
//formado (escaleno, isósceles ou equilátero).
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite os angulos A,B,C: ");
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();

        double verify = A+B+C;
        if (verify == 180){
            if (A == B && B == C){
                System.out.println("Triângulo Equilátero.");
            } else if (A!=B && B==C) {
                System.out.println("Triângulo Isósceles.");
            } else if (A==B && B!=C) {
                System.out.println("Triângulo Isósceles.");
            } else if (A==C && B!=C) {
                System.out.println("Triângulo Isósceles.");
            } else if (A!=B && B!=C && A!=C) {
                System.out.println("Triângulo Escaleno.");
            } else {
                System.out.println("Sério cara como vc conseguiu isso?");
            }
        } else if (verify != 180) {
            System.out.println("Não é um triângulo.");
        } else {
            System.out.println("Como?????");
        }

        teclado.close();
    }
}
