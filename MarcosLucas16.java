import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("n: ");
        String bin = teclado.nextLine();
        boolean valbin = true;
        for (int a = 0; a<bin.length(); a++){
            char b = bin.charAt(a);
            if (b!= '0' && b!='1'){
                valbin = false;
                break;
            }
        }
        if (!valbin){
            System.out.println("num nn binario");
            return;
        }
        int dec=0, pot=1;
        for (int o = bin.length() - 1; o >=0; o--){
            if (bin.charAt(o)=='1') {
                dec += pot;
            }
            pot*=2;
        }
        String oct = "";
        int TD = dec;
        if (TD==0) oct="0";
        while (TD > 0){
            int rest = TD%8;
            oct = rest+oct;
            TD /= 8;
        }
        String hex = "";
        TD = dec;
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9','A','B', 'C', 'D', 'E', 'F'};
        if (TD == 0) hex="0";
        while (TD >0){
            int rest = TD%16;
            hex = hexChars[rest] + hex;
            TD /=16;
        }

        System.out.println("Decimal: "+dec);
        System.out.println("Octal: "+oct);
        System.out.println("Hexadecimal: "+hex);



        teclado.close();
    }
}