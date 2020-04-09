package section9;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake("chocolate");
        cake.setPrice(30.00);
        System.out.println("Cake flavor is " + cake.getFlavor());
        System.out.println("Price of this cake is " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(45.00);
        System.out.println("Birthday cake cost " + birthdayCake.getPrice());
        System.out.println("Flavor is " + birthdayCake.getFlavor());

        WeaddingCake weaddingCake = new WeaddingCake();
        weaddingCake.setFlavor(" pina colada");
        System.out.println("Weaddingcake has " + weaddingCake.getFlavor() + " flavor");
        System.out.println("Price of weaddingcake is " + weaddingCake.getPrice());

    }
}
