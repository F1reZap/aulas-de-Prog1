import java.util.Scanner;

public class lista4 {
    public static void main(String[] args) {
        String nomecid, nmaior="", nmenor="";
        double nacid, nveic, menor=0, maior=0, qtd200=0, razao;
        double somaacid=0, somaveic=0, mediaveic=0, mediacid=0, somaacid200=0, mediacid200;
        Scanner teclado = new Scanner(System.in);

        for (int i=1; i<=5; i++){
            System.out.println("Nome da cidade: ");
            nomecid = teclado.nextLine();

            System.out.println("quantidade de veiculos da cidade "+nomecid+": ");
            nveic = teclado.nextDouble();

            System.out.println("quantidade de acidentes da cidade "+nomecid+": ");
            nacid = teclado.nextDouble();
            teclado.nextLine();

            somaveic += nveic;
            somaacid += nacid;
            if (nveic<200){
                somaacid200 += nacid;
                qtd200 ++;
            }
            if (i==1){
                maior = nacid;
                nmaior = nomecid;
                menor = nacid;
                nmenor = nomecid;
            } else {
                if (nacid>maior){
                    maior = nacid;
                    nmaior = nomecid;
                } else if (nacid<menor) {
                    menor = nacid;
                    nmenor = nomecid;
                } else {
                    System.out.println(".");
                }

            }
        }
        razao = somaacid/somaveic;
        mediaveic = somaveic/5;
        if (qtd200!=0) {
            mediacid200 = somaacid200/qtd200;
            System.out.println("media de acidentes - de 200 veiculos: "+mediacid200);
        } else {
            System.out.println("nenhuma cidade com menos de 200 veiculos");
        }
        System.out.println("Maior indice de acidentes: "+nmaior+ ", "+maior);
        System.out.println("Menor indice de acidentes: "+nmenor+ ", "+menor);
        System.out.println("Razão: "+razao);
        System.out.println("Média de veiculos nas 5 cidades: "+mediacid);

        teclado.close();
    }
}
