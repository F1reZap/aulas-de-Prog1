import java.util.Scanner;

public class listastring {
    public static void main(String[] args) {
        String Nome = "", Email = "", Senha = "";
        boolean maiuscula = false, minuscula = false, especial = false;
        double idade = 0;
        int i = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Nome: ");
            Nome = teclado.nextLine();
            int tamanho1 = Nome.length();
            if (tamanho1>2){
                System.out.println("Idade: ");
                idade = teclado.nextDouble();
                if (idade>0 && idade<150){
                    System.out.println("Email: ");
                    teclado.nextLine();
                    Email = teclado.nextLine();
                    Email.contains("@");
                    Email.contains(".com");
                    System.out.println("Senha: ");
                    teclado.nextLine();
                    Senha = teclado.nextLine();
                    for (int o = 0; o<Senha.length(); o++){
                        char letra = Senha.charAt(o);
                        if (Character.isUpperCase(letra)){
                            maiuscula = true;
                        } else if (Character.isLowerCase(letra)) {
                            minuscula = true;
                        } else if (!Character.isLetterOrDigit(letra)) {
                            especial = true;
                        } else {
                            System.out.println(".");
                        }

                    }

                }
            }

        }while (i != 1);

        System.out.println("Cadastro Completo");


        teclado.close();
    }
}
