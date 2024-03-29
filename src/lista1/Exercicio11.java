package lista1;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num, posH = 1, posL = 1;
        int highest = 0, lowest = 0;

        System.out.println("Digite o numero de alunos: ");
        num = scanner.nextInt();

        int[] height = new int[num];

        System.out.println("Digite as alturas: ");

        for (int i = 0; i < num; i++){
            height[i]= scanner.nextInt();
            if (i == 0){
                highest = height[i];
                lowest = height[i];
            }
            if (height[i] > highest){
                highest = height[i];
                posH = i + 1;
            }
            if (height[i] < lowest) {
                lowest = height[i];
                posL = i + 1;
            }
        }

        scanner.close();
            if (highest == lowest){
                System.out.println("As alturas sao iguais: " + highest + " cm e " + lowest + " cm");
            }
            else {
                System.out.println("O aluno mais alto e o " + posH + "°, com " + highest + "cm e o mais baixo e o " + posL + "°, com " + lowest + " cm");
            }
    }
}
