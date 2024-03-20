package lista1;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        char x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um caractere: ");
        x = entrada.next().charAt(0); // Não lê entrada.nextChar();
        entrada.close();

        if (Character.isDigit(x)) { // Verifica se o caractere é numérico: de 0 a 9
           System.out.println ("Numerico");
       } else if (Character.isLetter(x)) { // Verifica se o caractere é uma letra
           char lowercase = Character.toLowerCase(x);

           /*
                É necessario transformar os caracteres em minúsculo, pois os valores da tabela ascii para letras
                maiúsculas são diferentes
           */

           if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u'){
               System.out.println ("Vogal");
           } else {
               System.out.println ("Consoante");
           }
       }
       else {
           System.out.println ("Outro caractere qualquer");
       }
    }
}
