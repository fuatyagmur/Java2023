package day21inheritance;

public class Vehicle {

    /*

    1)Every Class except Object class has parent class in Java
    2)Object Class is the parent class of all Classes in Java
    3)Just Object Class does not have any Parent Class in Java

    4) Java executes "Constructors" from top to bottom in inheritance
    5)To be able to execute "Constructors" from top to bottom, Java goes to "Object Class" as default execution,
    firstly by the help of "super()" code.
    6)super() is for calling constructor frm the first level "parent class" (closest parent).
    7)super() is located by Java into every constructor but it is invisible
    8) If you want to make visible, you can type it explicitly.
    9) When you type "super()" explicitly, you have to type it into the first line inside the constructor body

    10) "this()" is for calling constructor from the class itself
    11) When you type "this()", you have to type it in the first line of constructor body.
    12) "this()" and "super()" cannot be used in the same constructır body together, because if you anyone of them
    the other line can accept the second one.

     */

    public void move(){
        System.out.println("All vehicles move...");
    }

    public void price(){
        System.out.println("To buy a vehicle, you should pay the price...");
    }

    public Vehicle() {
        System.out.println("Vehicle constructor...");
    }

    public Vehicle(String name){
        this();
        System.out.println("Vehicle constructor with String parameter worked");
    }
}

