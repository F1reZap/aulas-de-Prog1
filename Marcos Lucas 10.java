//10. O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar uma
//indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = PESO/(ALTURA²).
//Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição.
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Peso: ");
        double peso = teclado.nextDouble();
        System.out.println("Altura: ");
        double Alt = teclado.nextDouble();
        double altm = Alt/100;
        double IMC = peso/(Math.pow(altm,2));
        if (IMC < 18.5){
            System.out.println("IMC = " +IMC+ ". Abaixo do peso");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("IMC = " +IMC+ ". Peso Normal");
        } else if (IMC >= 25 && IMC <= 30) {
            System.out.println("IMC = " +IMC+ ". Acima do peso");
        } else if (IMC > 30) {
            System.out.println("IMC = " +IMC+ ". Obeso");
        } else {
            System.out.println("COMO");
        }

        teclado.close();
    }
}
