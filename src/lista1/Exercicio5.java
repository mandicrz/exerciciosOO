package lista1;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        int codeuser, code, keyuser, key;
        code = 1234;
        key = 9999;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo de usuario: ");
        codeuser = scanner.nextInt();
        scanner.close();

        if (codeuser == code){
           System.out.println("Agora, digite a senha: ");
           keyuser = scanner.nextInt();
           if (keyuser == key){
               System.out.println("Acesso permitido");
           } else {
               System.out.println("Senha incorreta");
           }
        } else {
            System.out.println("Usuario invalido!");
        }
    }
}

