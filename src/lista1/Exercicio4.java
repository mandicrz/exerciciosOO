package lista1;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        int day1, month1, year1;
        int day2, month2, year2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira data: ");
        String[] date1 = scanner.nextLine().split("/");
        day1 = Integer.parseInt(date1[0]);
        month1 = Integer.parseInt(date1[1]);
        year1 = Integer.parseInt(date1[2]);

        System.out.println("Digite a segunda data: ");
        String[] date2 = scanner.nextLine().split("/");
        day2 = Integer.parseInt(date2[0]);
        month2 = Integer.parseInt(date2[1]);
        year2 = Integer.parseInt(date2[2]);

        scanner.close();


        if (year1 > year2 || (year1 == year2 && month1 > month2) || (year1 == year2 && month1 == month2 && day1 > day2)){
            System.out.println("A primeira data é maior: " + formatDate(day1, month1, year1));
        }
        else if (year1 < year2 || month1 < month2 || day1 < day2) {
            System.out.println("A segunda data é maior: " + formatDate(day2, month2, year2));
        }
        else {
            System.out.println("As datas são iguais: " + formatDate(day1, month1, year1));
    }

    }
    public static String formatDate(int day, int month, int year) {
        return String.format("%02d, %02d, %04d", day, month, year);
    }
}
