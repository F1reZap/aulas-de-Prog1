//17. Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente
import java.util.Scanner;

public class lista3 {

    public static void main(String[] args) {
        double n1, n2, n3, alunos;
        Scanner teclado = new Scanner(System.in);
        alunos = 0;
        while (alunos<10){
            System.out.println("digite 3 notas do aluno: ");
            n1 = teclado.nextDouble();
            n2 = teclado.nextDouble();
            n3 = teclado.nextDouble();
            double med = (n1+n2+n3)/3;
            alunos = alunos+1;
            System.out.println("o aluno: "+alunos+ ". tirou: "+med);
        }

        teclado.close();
    }
}
