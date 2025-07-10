import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        int numini=0, num=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero: ");
        num = teclado.nextInt();
        numini=num;
        for (int i = 1; i<numini; i++){
            if (i!=1){
                num=num*i;
            } else{
                num=numini*i;
            }

        }
        System.out.println(numini+"!="+num);
        teclado.close();
    }
}