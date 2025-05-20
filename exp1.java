import java.util.Scanner;
public class helium {
    public static void main(String []args){
        //System.out.println("Mãe, virei garoto de programa");
        Scanner teclado = new Scanner(System.in);
        byte idade;
        int filhos;
        double peso;
        char sexo;
        boolean fumante;
        String nome;
        idade = 19;
        filhos = 0;
        peso = 85.5;
        sexo = 'M';
        fumante = false;
        nome = "Marcos";
        System.out.format("Me chamo %s \n\ttenho %d filhos, \npeso %.2f kg\n", nome, filhos, peso);
        System.out.format("Me chamo"+nome+
                " tenho "+filhos+" filhos, peso "+peso+
                " Kg, sou do sexo "+sexo+
                " e minha condição de fumante é "+fumante);
    }
}
