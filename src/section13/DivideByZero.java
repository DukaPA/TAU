package section13;

public class DivideByZero {

    public static void main(String[] args) {

        try {
            int c = 30/0;
        }catch (ArithmeticException e){
            System.out.println("Division with zero is not permitted");
        }finally {
            System.out.println("Sivision is fun");
        }


    }
}
