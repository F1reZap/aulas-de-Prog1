//4. Faça um algoritmo que receba 3 notas e seus respectivos pesos, calcule e mostre a média ponderada dessas
//notas
import java.util.Scanner;

public class um {
    public static void main(String[] args) {
        float a, b, c, ap, bp, cp, da, db, dc, ea, eb, ec;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite as notas e seus pesos: ");
        a = teclado.nextFloat();
        ap = teclado.nextFloat();
        b = teclado.nextFloat();
        bp = teclado.nextFloat();
        c = teclado.nextFloat();
        cp = teclado.nextFloat();
        // contas malditas

        da = a*ap;
        db = b*bp;
        dc = c*cp;
        ea = da+db+dc;
        eb = ap+bp+cp;
        ec = ea/eb;
        System.out.println("a média ponderada é: " +ec);
    }
}