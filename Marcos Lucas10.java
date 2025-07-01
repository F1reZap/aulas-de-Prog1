import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite: ");
        int N = teclado.nextInt();
        double Mai = 0;
        double Men = 0;
        double valor = 0;
        for (int i = 1; i<=N; i++){
            System.out.println("Digite N°: ");
            valor = teclado.nextDouble();
            if (i == 1){
                Mai = valor;
                Men = valor;
            } else {
                if (valor<Men){
                    Men = valor;
                } else if (valor>Mai) {
                    Mai = valor;
                } //else {
//                    System.out.println(".");
//                }

            }
        }
        System.out.println("Maior: "+Mai+ " Menor: "+Men);
    }
}
