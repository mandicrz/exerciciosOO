package lista1;
public class Exercicio9 {
    public static void main(String[] args) {
        double tC, tF;
        for (tC = 50; tC <= 65; tC++) {
            tF = (9 * tC/5) + 32;
            System.out.printf ("%.1f °F  ", tF);
            System.out.printf ("%.1f °C  \n", tC);
        }
    }
}
