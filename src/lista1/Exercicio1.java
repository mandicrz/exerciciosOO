package lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int velMax, vel, multa, dif;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a velocidade maxima da avenida: ");
        velMax = entrada.nextInt();
        System.out.println("Digite a velocidade que o motorista estava dirigindo: ");
        vel = entrada.nextInt();

        dif = vel - velMax;

        if (dif <= 10 && dif > 0){
            multa = 50;
            System.out.println("Sua multa e de " + multa + " reais");
        }
        else if (dif <= 30 && dif >= 11) {
            multa = 100;
            System.out.println("Sua multa e de " + multa + " reais");
        }
        else if (dif >= 31) {
            multa = 200;
            System.out.println("Sua multa e de " + multa + " reais");
        }
        else {
            System.out.println("Voce nao recebeu uma multa");
        }

    }
}
