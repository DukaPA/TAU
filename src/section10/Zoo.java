package section10;

public class Zoo {

    public static void main(String[] args) {
        Dog jhonny = new Dog();
        jhonny.fetch();
        jhonny.makeSound();
        feed(jhonny);

        Animal cheda = new Dog();
        cheda.makeSound();
        feed(cheda);

        cheda = new Cat();
        cheda.makeSound();
        ((Cat)cheda).scratch();
        feed(cheda);
    }
    public static void feed(Animal animal){

        if (animal instanceof Dog){
            System.out.println("here is your dog food");
        }
        else if(animal instanceof Cat){
            System.out.println("here is you food cat");
        }
    }
}
