//15. implemente um algoritmo que receba de entrada um valor inteiro com 4 dígitos e verifique se o mesmo
//pertence à família dos binários. Para isto, “desmembre” o número digitado verifique se foram digitados
//somente bits. Caso seja binário, mostre o equivalente em decimal.
import java.util.Scanner;

public class lista3 {

    public static void main(String[] args) {
        double dec1, dec2, dec3, dec4;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu numero binário: ");
        int Bi = teclado.nextInt();
        int bit1, bit2, bit3, bit4;

        bit1=Bi%10;
        Bi=Bi/10;
        bit2=Bi%10;
        Bi=Bi/10;
        bit3=Bi%10;
        Bi=Bi/10;
        bit4=Bi%10;
        Bi=Bi/10;
        if (bit1 == 1 || bit1 == 0){
            if (bit2 == 1 || bit2 == 0){
                if (bit3==1 || bit3==0){
                    if (bit4==1 || bit4 ==0){
                        System.out.println("é binário");
                        if (bit1 == 1){
                            dec1 = 1;
                            if (bit2 == 1){
                                dec2 = Math.pow(2, 1);
                                if (bit3 == 1){
                                    dec3 = Math.pow(2, 2);
                                    if (bit4 == 1){
                                        dec4 = Math.pow(2, 3);
                                    } else {
                                        dec4 = 0;
                                    }
                                } else {
                                    dec3 = 0;
                                    if (bit4 == 1){
                                        dec4 = Math.pow(2, 3);
                                    } else {
                                        dec4 = 0;
                                    }
                                }
                            } else {
                                dec2 = 0;
                                if (bit3 == 1){
                                    dec3 = Math.pow(2, 2);
                                    if (bit4 == 1){
                                        dec4 = Math.pow(2, 3);
                                    } else {
                                        dec4 = 0;
                                    }
                                } else {
                                    dec3 = 0;
                                    if (bit4 == 1){
                                        dec4 = Math.pow(2, 3);
                                    } else {
                                        dec4 = 0;
                                    }
                                }
                            }
                        } else {
                            dec1 = 0;
                            if (bit2 == 1){
                                dec2 = Math.pow(2, 1);
                                if (bit3 == 1){
                                    dec3 = Math.pow(2, 2);
                                    if (bit4 == 1){
                                        dec4 = Math.pow(2, 3);
                                    } else {
                                        dec4 = 0;
                                    }
                                } else {
                                    dec3 = 0;
                                    if (bit4 == 1){
                                        dec4 = Math.pow(2, 3);
                                    } else {
                                        dec4 = 0;
                                    }
                                }
                            } else {
                                dec2 = 0;
                                if (bit3 == 1){
                                    dec3 = Math.pow(2, 2);
                                    if (bit4 == 1){
                                        dec4 = Math.pow(2, 3);
                                    } else {
                                        dec4 = 0;
                                    }
                                } else {
                                    dec3 = 0;
                                    if (bit4 == 1){
                                        dec4 = Math.pow(2, 3);
                                    } else {
                                        dec4 = 0;
                                    }
                                }
                            }
                        }
                        double decF = dec1+dec2+dec3+dec4;
                        System.out.println(+decF);
                    }else {
                        System.out.println("não binário: ");
                    }
                }else {
                    System.out.println("não binário: ");
                }
            }else {
                System.out.println("não binário: ");
            }
        } else {
            System.out.println("não binário: ");
        }

        teclado.close();
    }
}
