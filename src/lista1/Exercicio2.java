package lista1;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        char x;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um caractere: ");
        x = entrada.next().charAt(0); // não lê entrada.nextChar();
        
       if (Character.isDigit(x)) { // verifica se o caractere é numérico: de 0 a 9
           System.out.println ("Numerico");
       } else if (Character.isLetter(x)) {
           char lowercase = Character.toLowerCase(x); // transforma todos os caracteres em minusculo para separar
           if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u'){
               System.out.println ("Vogal");
           } else {
               System.out.println ("Consoante");
           }
       }
       else {
           System.out.println ("Outro caractere qualquer");
       }
        entrada.close();
    }
}
