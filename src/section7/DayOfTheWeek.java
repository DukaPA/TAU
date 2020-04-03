package section7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        String[] week ={"Monday","Tuesday","Wednesday","Thursday","Friday","Satuday","Sunday"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number for day of the week: " );
        int index = scanner.nextInt();
        scanner.close();

        System.out.println("Coresponding day: " + week[index - 1]);
    }
}
