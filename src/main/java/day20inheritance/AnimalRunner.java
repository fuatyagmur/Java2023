package day20inheritance;

public class AnimalRunner {

    public static void main(String[] args) {
        Cat myCat=new Cat();
        myCat.eat();
        myCat.drink();
        myCat.meow();

        System.out.println();

        Dog myDog=new Dog();
        myDog.bark();
        myDog.drink();
        myDog.eat();

        System.out.println();

        Bird myBird=new Bird();
        myBird.tweet();
        myBird.eat();
        myBird.drink();

    }
}
