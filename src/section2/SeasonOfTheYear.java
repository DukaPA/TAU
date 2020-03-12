package section2;

import java.util.Scanner;

public class SeasonOfTheYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Favorite season of the year is: ");
        String season = scanner.next();

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Write an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
