package lista1;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero de 1 a 10: ");
        num = scanner.nextInt();

        String[] numberFull = {
                "Um", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez"
        };

        if (num >= 1 && num <= 10){
            String full = numberFull[num-1];
            System.out.println(full);
        } else {
            System.out.println("Nao foi possivel mostrar seu extenso");
        }

    }
}
