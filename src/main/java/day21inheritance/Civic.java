package day21inheritance;

public class Civic extends Honda {

    public void ecoSystem(){
        System.out.println("Using Civic is not expensive...");
    }

    public Civic() {
        System.out.println("Just Civic");
    }

    public Civic(boolean hybrid) {
        this();
        System.out.println("Civic constructor with boolean parameter worked...");
    }
}
