package section2;


import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        //get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //hourly pay rate
        System.out.println("Enter the emplyee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //multiply hours and pay rate
        double grossPay = hours * rate;

        //display result
        System.out.println("Grosspay for employee is $" + grossPay);
    }
}