//3. Implemente um algoritmo que receba 3 números reais de entrada. Calcule e mostre o resultado da
//multiplicação dos dois primeiros números dividido pelo terceiro número fornecido pelo usuário. Sabe-se
//que o denominador não pode ser zero, mas neste momento não se preocupe com as validações.
import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        float a, b, c, d;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os numeros: ");
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        // contas malditas
        d = a * b / c;

        System.out.println("o numero é: " + d);
    }
}
