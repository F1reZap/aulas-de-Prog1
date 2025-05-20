//7.Zé Borba Gato é dono de um terreno na cidade de Sabará e deseja saber qual seria o preço médio de venda
//desse terreno. Conforme visto na planta do mesmo, nota-se que o lote possui um formato de trapézio
//Assim sendo, dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e
//sabendo o valor médio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a área
//total e o valor médio de venda (R$) que Zé Borba Gato pode pedir pelo terreno.
import java.util.Scanner;

public class aulajava {
    public static void main(String[] args) {
        float a, b, c, ab, abc, at, v, pv ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Base maior: ");
        a = teclado.nextFloat();
        System.out.println("Base Menor: ");
        b = teclado.nextFloat();
        System.out.println("Altura: ");
        c = teclado.nextFloat();
        System.out.println("Valor do M²: ");
        v = teclado.nextFloat();
        // contas malditas
        ab = a+b;
        abc = ab*c;
        at = abc/2;
        pv = v*at;
        
        System.out.println("A área total é: "+at+"m². e o preço de venda é: "+pv+"R$, por M².");
    }
}