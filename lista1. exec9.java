//9. A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
//desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
//realização de 2 copas mundiais. Sabendo dessas informações, faça um algoritmo que, dado o ano atual,
//calcule o número de copas já realizadas e exiba o resultado ao usuário.
import java.util.Scanner;

public class pericles {
    public static void main(String[] args) {
        float ai, af, c1, c2, c3, t ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        ai = teclado.nextFloat();
        // contas malditas
        af=1930;
        c1 = ai-af;
        c2 = c1/4;
        c3 = c2-2;

        System.out.println("tivemos "+c3+" copas, dês de 1930.");
    }
}
