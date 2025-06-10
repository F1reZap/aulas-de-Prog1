//07.Na cidade de Sabará, para transferências de veículos, a SABATRAN cobra uma taxa de 1% para carros
//fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa está
//incidindo sobre o valor de tabela do carro. Implemente um algoritmo que lê o ano de fabricação e o preço
//do carro e a seguir calcula e imprime imposto a ser pago.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o ano dos eu carro: ");
        double ano = teclado.nextDouble();
        System.out.println("Qual o preço do seu carro: ");
        double prec = teclado.nextDouble();

        if (ano < 1990){
            double carro = ((prec/100)*1)+prec;
            System.out.println("o preço é: "+carro+"R$");
        } else if (ano >= 1990) {
            double carro = ((prec/100)*1.5)+prec;
            System.out.println("o preço é: "+carro+"R$");
        } else {
            System.out.println("COMO??????????????");
        }
        teclado.close();
    }
}