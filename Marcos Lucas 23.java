//23. Num dado momento, 3 canais de TV tinham, em sua programação, novelas em seu horário nobre: canal A,
//novela A, canal B, novela B, canal C novela C. Numa pesquisa com 3000 pessoas, perguntou-se quais
//novela agradavam. A tabela a seguir mostra o resultado da pesquisa:
//Novelas Nº de telespectadores
//A 1450
//B 1150
//C 900
//A e B 350
//A e C 400
//B e C 300
//A, B e C 100
//Implemente um algoritmo que receba os valores informados na tabela como entrada de dados e calcule a
//quantidade de pessoas que não gostam de nenhuma das novelas. Utilize as fórmulas da Teoria dos Conjuntos
//para calcular corretamente os totais, lembrando que há sobreposição entre os grupos

public class Main {
    public static void main(String[] args) {
        double A, B, C, AB, AC, BC, ABC, cal1, cal2, cal3, cal4, Total ;
        Total = 3000;
        A = 1450;
        B = 1150;
        C = 900;
        AB = 350;
        AC = 400;
        BC = 300;
        ABC = 100;
        //Contas malditas
        cal1 = A+B+C-AB-AC-BC+ABC;
        cal2 = Total-cal1;



        System.out.println("O Número de pessoas que não gostam de nenhuma novela é: "+cal2);
    }

}
