package lista1;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        int num;
        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = scanner.nextInt();
        scanner.close();

        if (num <= 1){
            isPrime = false;
        }

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }


        if (isPrime) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

    }
}
