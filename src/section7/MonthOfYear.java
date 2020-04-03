package section7;

import java.util.Scanner;

public class MonthOfYear {

    public static void main(String[] args) {

        String[] month = {"Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar"};

        System.out.println("Unesi broj meseca u godini: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.close();

        System.out.println("Odabrani mesec je: " + month[index - 1]);
    }
}
