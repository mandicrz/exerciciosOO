package lista1;
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        int quantity;
        double unityPrice, total, discount, totalPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual e o nome do produto? ");
        String name = scanner.nextLine();
        System.out.println("Qual e a quantidade adquirida do produto "+ name +" ? ");
        quantity = scanner.nextInt();
        System.out.println("Qual e o preco unitario dele? ");
        unityPrice = scanner.nextDouble();
        scanner.close();

        total = quantity * unityPrice;

        if (quantity <= 5){
            discount = 0.02 * total;
        } else if (quantity <= 10) {
            discount = 0.03 * total;
        } else {
            discount = 0.05 * total;
        }

        totalPrice = total - discount;

        System.out.println("O valor total, sem o desconto e de " + total + " reais, o desconto sera de " + discount + " reais e o total a se pagar e " + totalPrice + " reais");
    }
}
