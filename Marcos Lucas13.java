import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        int num = 0, o=2, imp=1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("numero: ");
        num = teclado.nextInt();
        double veriF1 = Math.sqrt(num), veriF2=0;
        if (num<=0){
            System.out.println("numero não pode ser primo");
        } else {
            if (num!=2){
                if (num %2==0){
                    System.out.println(num+". não é primo");
                } else {
                    while (imp<=veriF1){
                        imp=imp+2;
                        veriF2 = num%imp;
                        if (veriF2==0){
                            System.out.println(num+". não é primo");
                            return;
                        }
                    }
                    System.out.println(num+". é primo");
                }

            } else {
                System.out.println(num+". é primo");
            }
        }
        teclado.close();
    }
}
