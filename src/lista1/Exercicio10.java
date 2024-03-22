package lista1;
public class Exercicio10 {
    public static void main(String[] args) {
        int numerador = 1;
        int denominador;
        double soma = 0;

        for (denominador = 1; denominador <= 50; denominador++) {
            soma = soma + ((double) numerador /denominador);
            numerador = numerador + 2;
        }

        System.out.printf("A soma e %.2f", soma);
    }
}
