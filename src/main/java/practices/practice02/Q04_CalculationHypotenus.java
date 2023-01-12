package practices.practice02;

public class Q04_CalculationHypotenus {

    public static void main(String[] args) {

        //Type a code that calculates the hypotenuse.
        //Formula of hypotenuse: a²+b²=c²
        //a*a

        double a = 6;
        double b = 8;

        double c= Math.sqrt(a*a+b*b);   //If we use int, we should write like: (int) Math.sqrt(a*a+b*b)

        System.out.println("Hypotenuse: " + c);


    }
}
