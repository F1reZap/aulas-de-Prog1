//12. Dona Maria das Couve é uma mulher muito preocupada com sua saúde e busca a prática de exercícios
//físicos constantes. Devido a crise financeira, Dona Maria está sem dinheiro para pagar academia, e teve
//como alternativa fazer caminhada diária ao redor do quarteirão de sua casa. O quarteirão da casa dela
//possui formato de um triângulo retângulo (figura abaixo), sabendo que ela deve caminhar um valor fixo de
//km por dia e dadas as medidas das ruas A e B (em metros) da figura abaixo, calcule e mostre quantas
//voltas Dona Maria precisa fazer no quarteirão para que ela atinja sua meta.

import java.util.Scanner;

public class lista2 {
    public static void main(String[] args){
        double rA, rB, rC, per, mkm, TV;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite a sua metra de KMs: ");
        mkm = teclado.nextDouble();
        System.out.println("digite o comprimento da Rua A: ");
        rA = teclado.nextDouble();
        System.out.println("digite o comprimento da Rua B: ");
        rB = teclado.nextDouble();
        //contas malditas
        rC = Math.sqrt(Math.pow(rA,2)+Math.pow(rB,2));
        per = rA+rB+rC;
        TV = (mkm*1000)/per;
        TV = Math.ceil(TV);

        System.out.format("Para cumprir a meta dona Maria prescisa fazer %.0f voltas no quarteirão", TV);
        teclado.close();
    }
}
