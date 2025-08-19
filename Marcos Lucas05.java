//Marcos Lucas de Souza Machado
//Exp de testes realizados:
//teste1. calculo da média da matriz (Funcinou)
//teste2,3,4,5,6. mudança de código pra atuar linha por linha (funcionou 90%) *primeira linha sempre dando problema
//teste7. impossivel de ser resolvido era problema do random só jogar numeros muito baixos (possivel solução: preencher manualmente)

import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;

//5. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à
//média. Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores
//altos indicam maior dispersão dos dados. O gerente de produção da Refrigerator Tabajará está avaliando o
//processo de fabricação de seus refrigerantes em lata, especificamente a etapa de preenchimento do
//conteúdo. As latas devem possuir 390 ml, com desvio padrão de + ou – 5 ml. Na análise foram coletadas
//20 amostras aleatórias das 6 linhas de produção da fábrica, medindo-se a quantidade de produto das
//mesmas. Você é o programador da empresa, e ficou incumbido de implementar um programa que auxilie
//seu gerente, mostrando ao mesmo a média e o desvio padrão de cada linha de produção. Além disso,
//exiba, se for o caso, qual das linhas de produção precisa ser revisada.

public class lista6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[][] Producao = new int[6][20];
        double[] Media = new double[6];
        double[] DesvioPadrao = new double[6];
        int prench=0, X=0, N=1;
        double media1=0, media2=0;
        double DP1=0, DP2 =0, DP3 =0;

        //for de preenchimento:
        for (int i = 0; i< Producao.length; i++){
            for (int j = 0; j< Producao[i].length; j++){
                prench = random.nextInt(385, 395);
                System.out.println(prench);
                Producao[i][j] = prench;
//                System.out.println(".");
            }
        }
        //for cálculo de média
        for (int i = 0; i< Producao.length; i++){
            for (int j = 0; j< Producao[i].length; j++){
                media1+= Producao[i][j];
            }
            media2 = media1/ Producao[i].length;
            Media[i]=media2;
//            System.out.println(media2);
            media1=0;
            media2=0;
        }
        //for calculo desvio padrão
        for (int i=0; i<Producao.length; i++){
            for (int j=0; j<Producao[i].length; j++){
                X = Producao[i][j];
                DP1 = Math.pow((X-media2), 2);
                DP2 +=DP1;
                N++;
            }
            DP3 =Math.sqrt((DP2 /N));
            DesvioPadrao[i]= DP3;
            System.out.println(DP3);
            DP1=0;
            DP2 =0;
            DP3 =0;
            N=0;
        }
        //Verificação
        for (int i=0; i<DesvioPadrao.length; i++){
            if (DesvioPadrao[i]<384 || DesvioPadrao[i]>396){
                System.out.println("Linha: "+i+". prescisa ser revisada");
            } else {
                System.out.println("Linha: "+i+". OK");
            }
        }

        //fazer linha por linha**********************************

        //:x Meu Deus
//        for (int i=0; i< Producao.length; i++){
//            for (int j=0; j<Producao[i].length; j++){
//                X = Producao[i][j];
//                DP1 = X-media2;
//                DP2 = Math.pow(DP1, 2);
//                DP2 +=DP2;
//                N++;
//            }
//            DP4= DP2 /N;
//            DP3 =Math.sqrt(DP4);
//            System.out.println(DP3);
//        }
//        for (int i=0; i< Producao.length; i++){
//            for (int j=0; j<Producao[i].length; j++){
//
//            }
//        }
    }
}