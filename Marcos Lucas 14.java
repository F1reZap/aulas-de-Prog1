//14. Implemente um programa que receba um número inteiro de 3 dígitos de entrada. Após isso, verifique se o
//mesmo é palíndromo, ou seja, é o mesmo número lido da direita para esquerda ou vice-versa. Ex.: 121,
//353, etc
import java.util.Scanner;

public class lista3 {
    public static boolean isPalindrome(int num){
        String numStr = String.valueOf(num);
        String revNum = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(revNum);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um numero para verificar se é palindromo: ");
        int num = teclado.nextInt();

        if (isPalindrome(num)){
            System.out.println(num+ " é um palíndro");
        } else {
            System.out.println(num+ " não é um palíndro");
        }


        teclado.close();
    }
}
