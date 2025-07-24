import java.util.Scanner;
public class lista5 {
    public static void main(String[] args){
        int Tmai=0, Tmen=0, AMN=0, AMV=0;
        int ID[] = new int[40];
        double Media=0, medG=0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i<40; i++){
            System.out.println("Digite o aluno "+i);
            ID[i] = teclado.nextInt();
            if (i==0){
                AMN = ID[i];
                AMV = ID[i];
                if (ID[i]<=16){
                    Tmen++;
                } else {
                    Tmai++;
                }
            } else {
                if (ID[i]<AMN){
                    AMN = ID[i];
                } else if (ID[i]>AMV) {
                    AMV = ID[i];
                }
                if (ID[i]<=16){
                    Tmen++;
                } else {
                    Tmai++;
                }

            }
            Media += ID[i];
        }
        medG = Media/40;
        System.out.println("Alunos com idade menor ou igual a 16: "+Tmen);
        System.out.println("Alunos com idade maior a 16: "+Tmai);
        System.out.println("Média das idades: "+medG);
        System.out.println("Idade do aluno mais novo: "+AMN);
        System.out.println("Idade do aluno mais velho: "+AMV);
        teclado.close();
    }
}