import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double cal = 0;
        double cal2 = 0;
        for (int i =1; i<=10; i++){
            cal = cal+i;


        }
        cal2 = cal/10;
        System.out.println("Soma: "+cal+ " media: "+cal2);
    }
}
