import java.awt.Toolkit;

public class Relogio {
    public static void main(String[] args) {
        int horas=0,minutos=0,segundos=0;
        while (true){
            System.out.printf("%02d:%02d:%02d\n", horas, minutos,segundos);
            Toolkit.getDefaultToolkit().beep();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){

            }

            segundos++;

            if (segundos == 60){
                segundos=0;
                minutos++;
            } else if (minutos == 60) {
                minutos = 0;
                horas++;
            } else if (horas == 24) {
                horas = 0;

            }
        }


//        for (int h=0; h<24; h++){
//            for (int m=0; m<60; m++){
//                System.out.println(h+":"+m);
//
//            }
//        }
    }
}
