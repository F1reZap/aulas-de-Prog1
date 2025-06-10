//Crie um programa Java que simule um sistema de acesso a um aplicativo. O
//programa deve pedir ao usuário um nome de usuário (String) e uma senha
//(numérica).
//As condições para acesso devem ser:
//● O nome de usuário deve ser "admin".
//● A senha deve ser "12345".
//○ Se as duas condições forem verdadeiras, exiba a mensagem
//"Acesso concedido. Bem-vindo, admin!".
//○ Se apenas o nome de usuário estiver correto, mas a senha não,
//exiba "Senha incorreta.".
//○ Se o nome de usuário estiver incorreto (independentemente da
//senha), exiba "Usuário não encontrado."
import java.util.Scanner;

public class sabletiv {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuário: ");
        String user = teclado.nextLine();
        String ub = "admin";
        System.out.println("Senha: ");
        double Senha = teclado.nextDouble();

        if (user.equals(ub)){
            if (Senha == 12345){
                System.out.println("Acesso concedido. Bem-Vindo admin");
            } else {
                System.out.println("Senha incorreta.");
            }
        } else {
            System.out.println("Usuário não encontrado");
        }


        teclado.close();
    }
}
