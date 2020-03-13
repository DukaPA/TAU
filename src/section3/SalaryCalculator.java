package section3;

import java.util.Scanner;

/*
If statement
 */
public class SalaryCalculator {
    public static void main(String[] args) {

        //initialize know value
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for the unknow
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //quick detour for the bonus earners
        if(sales >= quota){
            salary = salary + bonus;
        }

        //output
        System.out.println("The employee's pay is $" + salary);
    }
}
