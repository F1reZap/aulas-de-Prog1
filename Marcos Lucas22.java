public class lista4 {
    public static void main(String[] args) {
        double S = 0.0;
        int snl = 1;

        for (int i = 1, cont = 0; cont < 51; i += 2, cont++) {
            S += snl * 1.0 / Math.pow(i, 3);
            snl *= -1;
        }


        double pi = Math.cbrt(S * 32);

        System.out.printf("Valor aproximado de PI: %.10f\n", pi);
    }
}
