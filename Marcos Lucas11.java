import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        String nome, nmaior = "", nmenor = "";
        double nota, menor = 0, maior = 0;
        double somanot = 0;
        int mumero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("quantos alunos você tem: ");
        mumero = teclado.nextInt();

        for (int i = 1; i <= mumero; i++) {
            System.out.println("Nome do aluno: ");
            teclado.nextLine();
            nome = teclado.nextLine();

            System.out.println("nota do aluno " + nome + ": ");
            nota = teclado.nextDouble();



            somanot += nota;
            if (i == 1) {
                maior = nota;
                nmaior = nome;
                menor = nota;
                nmenor = nome;
            } else {
                if (nota > maior) {
                    maior = nota;
                    nmaior = nome;
                } else if (nota < menor) {
                    menor = nota;
                    nmenor = nome;
                } else {
                    System.out.println(".");
                }

            }
        }
        double media = somanot/ mumero;

        System.out.println("Maior nota: "+maior+ ". aluno: "+nmaior);
        System.out.println("Menor nota: "+menor+ ". aluno: "+nmenor);
        System.out.println("Soma das notas: "+somanot+". média: "+media);
        teclado.close();
    }
}