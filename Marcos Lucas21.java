import java.util.Scanner;

public class lista4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double TR = 0, TC = 0, TI = 0;
        int ContTipo1e2 = 0;
        double SUMTipo1e2 = 0;

        while (true) {
            System.out.print("Número do consumidor (0 para sair): ");
            int N = teclado.nextInt();

            if (N == 0) {
                break;
            }

            System.out.print("Quantidade de kWh consumidos: ");
            double kwh = teclado.nextDouble();

            System.out.print("Tipo do consumidor (1-Residencial, 2-Comercial, 3-Industrial): ");
            int tipo = teclado.nextInt();

            double cost = 0;

            if (tipo == 1) {
                cost = kwh * 0.3;
                TR += kwh;
                SUMTipo1e2 += kwh;
                ContTipo1e2++;
            } else if (tipo == 2) {
                cost = kwh * 0.5;
                TC += kwh;
                SUMTipo1e2 += kwh;
                ContTipo1e2++;
            }
            else if (tipo == 3) {
                cost = kwh * 0.7;
                TI += kwh;
            }
            else {
                System.out.println("Tipo de consumidor inválido! Dados ignorados.");

            }

            System.out.println("Custo total para o consumidor " + N + ": R$ " + cost);
            System.out.println("--------------------------------------");
        }


        System.out.println("\n=== RELATÓRIO FINAL ===");
        System.out.println("Total de consumo Residencial (Tipo 1): " + TR + " kWh");
        System.out.println("Total de consumo Comercial (Tipo 2): " + TC + " kWh");
        System.out.println("Total de consumo Industrial (Tipo 3): " + TI + " kWh");

        if (ContTipo1e2 > 0) {
            double media = SUMTipo1e2 / ContTipo1e2;
            System.out.println("Média de consumo dos Tipos 1 e 2: " + media + " kWh");
        } else {
            System.out.println("Nenhum consumo dos Tipos 1 e 2 foi registrado.");
        }
    }
}