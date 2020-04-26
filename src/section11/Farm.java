package section11;

public class Farm {
    public static void main(String[] args) {


        Animal donald = new Duck();
        donald.makeSound();

        Duck daffy = new Duck();
        daffy.makeSound();

        Pig missPiggy = new Pig();
        missPiggy.makeSound();
        missPiggy.eat();
    }
}
