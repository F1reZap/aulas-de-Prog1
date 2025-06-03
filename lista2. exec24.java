//24. Considere uma equação do segundo grau na forma genérica (ax² + bx + c) e calcule o valor das raízes da
//mesma. Sabe-se que os coeficientes a, b, e c devem ser fornecidos pelo usuário. Utilize as equações abaixo
//como teste. Teste também para alguns valores aleatórios de coeficientes (exemplo a = 3, b = 2 e c =4) e
//veja que em alguns casos não se retornam as raízes de forma correta. Identifique o porquê desse problema e
//indique uma possível solução.
import java.util.Scanner;


public class lista2 {
    public static void main(String[] args) {
        double A, B, C, X, cal1, cal2, cal3, calAX2, calf, calBX, calC, tolemans;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o Valor A: ");
        A = teclado.nextDouble();
        System.out.println("digite o Valor B: ");
        B = teclado.nextDouble();
        System.out.println("digite o Valor C: ");
        C = teclado.nextDouble();
        System.out.println("digite o Valor X: ");
        X = teclado.nextDouble();
        //Contas malditas
        cal1 = Math.pow(X,2);
        cal2 = B*X;
        calAX2 =  Math.sqrt(cal1);
        calBX = Math.sqrt(cal2);
        calC = Math.sqrt(C);
        calf = (A*cal1)+(B*X)+C;
        tolemans = calAX2+calBX+calC;




        System.out.println("O resultado de 'AX²+BX+C' é: "+tolemans);
    }
}

//Quando o valor do discriminante (delta) é negativo, a equação não possui raízes reais, apenas raízes complexas (imaginárias).
// O método "Math.sqrt(delta)" não retorna um valor válido para números negativos,
//  causando resultados incorretos ou erros.