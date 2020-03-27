package section6;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        /**
         * Rectangle 1
         */
        //instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areOfRoom1 = room1.calculateArea();

        /**
         * Rectangle 2
         */
        Rectangle room2 = new Rectangle(30,75);
        double areOfRoom2 = room2.calculateArea();

        double totalArea = areOfRoom1 + areOfRoom2;

        System.out.println("are of both rooms : " + totalArea);
    }
}
