package section3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("enter the number of sales: ");
        Scanner scanners = new Scanner(System.in);
        int sales = scanners.nextInt();
        scanners.close();

        if(sales >= quota){
            System.out.println("Congratulations! You met your quota");
        }else{
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You made " + salesShort + " less" );
        }
    }
}
