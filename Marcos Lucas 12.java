//12.Faça um programa que receba de entrada a data de votação do ano atual e a data de nascimento de uma
//pessoa. As datas podem ser lidas em 3 informações (dia, mês e ano). Faça as devidas comparações e
//verifique se essa pessoa não pode votar, é obrigada a votar ou o voto é facultativo, segundo as regras
//brasileiras.
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
