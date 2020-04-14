package section10;

public class Banana extends Fruit {

    public Banana(){
        setCalories(90);
    }

    public void peel(){
        System.out.println("Banana has been peeled!");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is gross :( ");
    }
}
