package lista1;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio3 {
    public static void main(String[] args) {
        int a, b, c;
        double delta,r1, r2;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Digite o valor de a: ");
        a = scanner.nextInt();
        System.out.println ("Digite o valor de b: ");
        b = scanner.nextInt();
        System.out.println ("Digite o valor de c: ");
        c = scanner.nextInt();

        delta = Math.pow(b, 2) - 4*a*c;

        if (delta > 0){
            r1 = (-(b) + Math.sqrt(delta))/(2*a);
            r2 = (-(b) - Math.sqrt(delta))/(2*a);
            System.out.println ("As raizes sao: " + r1 + " e " + r2);
        }
        else if (delta == 0) {
            r1 = -(b)/(2*a);
            System.out.println ("A unica raiz real e " + r1);
        }
        else {
            System.out.println ("Nao existem raizes reais");
        }
        scanner.close();
    }
}
