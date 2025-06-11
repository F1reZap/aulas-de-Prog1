//11. Elabore um programa que calcule e exiba a tensão S de uma barra cilíndrica de diâmetro D
//submetida a uma carga Q. Os valores de D e Q devem ser fornecidos pelo usuário do programa via
//teclado. Utilize a fórmula:
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o ano, mês e dia que você nasceu: ");
        double anoN = teclado.nextDouble();
        double mesN = teclado.nextDouble();
        double diaN = teclado.nextDouble();
        System.out.println("Qual o ano, mês e dia atuais: ");
        double anoA = teclado.nextDouble();
        double mesA = teclado.nextDouble();
        double diaA = teclado.nextDouble();

        double PdVt = anoA-anoN;
        if (PdVt < 16){
            System.out.println("Não Vota");
        } else if (PdVt >16 && PdVt<18 && PdVt<70) {
            System.out.println("Voto Facultativo");
        } else {
            System.out.println("Voto Obrigatório");
        }


        teclado.close();
    }
}
