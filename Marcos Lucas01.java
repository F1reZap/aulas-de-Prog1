import java.util.Scanner;

public class lista5 {
    public static void main(String[] args){
        int Tmai=0, Tmen=0, AMN=0, AMV=0, ID=0;
        double Media=0, medG=0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i<=40; i++){
            System.out.println("Digite a idade do aluno: ");
            ID = teclado.nextInt();
            if (i==1){
                AMN = ID;
                AMV = ID;
                if (ID<=16){
                    Tmen++;
                } else {
                    Tmai++;
                }
                Media = ID/i;
                medG = Media;
            } else {
                if (ID<=16){
                    Tmen++;
                } else {
                    Tmai++;
                }
                if (ID<AMN){
                    AMN = ID;
                } else if (ID>AMV) {
                    AMV = ID;
                }
                Media = (medG+ID)/i;
                medG = Media;
            }
        }
        System.out.println("Alunos com menos ou igual a 16: "+Tmen);
        System.out.println("Alunos com maior a 16: "+Tmai);
        System.out.println("Média das idades: "+medG);
        System.out.println("Aluno mais novo: "+AMN);
        System.out.println("Aluno mais velho: "+AMV);
    }
}