//5. Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter
//digitado é ou não uma vogal.
import java.util.Scanner;

public class lista3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um charactere: ");
        String chara = teclado.nextLine();
        String EV;

        switch (chara) {
            case "a":
                EV = "é vogal";
                break;
            case "A":
                EV = "é vogal";
                break;
            case "e":
                EV = "é vogal";
                break;
            case "E":
                EV = "é vogal";
                break;
            case "i":
                EV = "é vogal";
                break;
            case "I":
                EV = "é vogal";
                break;
            case "o":
                EV = "é vogal";
                break;
            case "O":
                EV = "é vogal";
                break;
            case "u":
                EV = "é vogal";
                break;
            case "U":
                EV = "é vogal";
                break;
            default:
                EV = "Não é vogal";
                break;
        }
        if (EV == "é vogal"){
            System.out.println("É Vogal");
        } else {
            System.out.println("Não é vogal");
        }
        teclado.close();
    }
}
