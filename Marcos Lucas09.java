import java.util.Scanner;
import java.util.Random;

public class lista5 {
    public static void main(String[] args) {
        int[] Altura = new int[50];
        int[] Sexo = new int[50];
        int AltMaior = 0, AltMenor = 0, abaixoMedia = 0;
        int MH = 0, MM = 0;
        double somaAltura = 0, mediaTurma = 0, somaHomens = 0, mediaHomens = 0, somaMulheres = 0, mediaMulheres = 0;
        int homensMenor = 201;
        int mulheresMaior = 99;

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            Altura[i] = random.nextInt(100, 200);
            Sexo[i] = random.nextInt(1, 3);
            somaAltura += Altura[i];

            if (Sexo[i] == 1) {
                somaHomens += Altura[i];
                MH++;
            } else {
                somaMulheres += Altura[i];
                MM++;
            }

            if (i == 0) {
                AltMaior = Altura[i];
                AltMenor = Altura[i];
            } else {
                if (Altura[i] > AltMaior) AltMaior = Altura[i];
                if (Altura[i] < AltMenor) AltMenor = Altura[i];
            }
        }

        mediaTurma = somaAltura / 50.0;
        if (MH > 0) mediaHomens = somaHomens / MH;
        if (MM > 0) mediaMulheres = somaMulheres / MM;

        for (int i = 0; i < 50; i++) {
            if (Sexo[i] == 1 && Altura[i] < homensMenor) {
                homensMenor = Altura[i];
            }
            if (Sexo[i] == 2 && Altura[i] > mulheresMaior) {
                mulheresMaior = Altura[i];
            }
        }

        for (int i = 0; i < 50; i++) {
            if (Altura[i] < mediaTurma) abaixoMedia++;
        }

        System.out.print("Mulheres com altura acima da média dos homens: ");
        for (int i = 0; i < 50; i++) {
            if (Sexo[i] == 2 && Altura[i] > mediaHomens) {
                System.out.print(Altura[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Homens com altura abaixo da média das mulheres: ");
        for (int i = 0; i < 50; i++) {
            if (Sexo[i] == 1 && Altura[i] < mediaMulheres) {
                System.out.print(Altura[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Maior Altura: " + AltMaior + ". Menor Altura: " + AltMenor);
        System.out.println("Média das alturas: " + mediaTurma);
        System.out.println("Mulher mais alta: " + mulheresMaior);
        System.out.println("Homem mais baixo: " + homensMenor);
        System.out.println("Quantidade de pessoas menores que a média: " + abaixoMedia);
    }
}