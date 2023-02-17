package day17_methodoverloading_datetime;

public class MethodOverloading01 {

    public static void main(String[] args) {

         /*
        1) If you create methods with same name and with different parameters it means
        you created "method overloading"
        2) If you make method names and the parameters same in two different methods Java complains because
        if teh names and the parameters are same Java will think the methods are exactly same and it will complain.
        Typing the methods repeatedly cannot be accepted by Java
        3) Java checks the method name and parameters(the variables inside the method parenthesis) to understand if the
        methods are same or not. The line that is typed "method name" and "parameters" are called "method signature".

        4)How can you make the method parameters different?
        i)We can use different data types for the parameters
        ii)If the data types are same you can change the order of the parameters
        iii)Change the number of the parameters

        5)Access modifiers do not take any role in "method overloading", that is why methods in any access modifier can be
        overloaded
        6) To be static or non-static does not have any affect on method overloading, that is why static and non-static
        methods can be overloaded.

         */

        System.out.println(multiply(3.2, 7));  //22.400000000000002
        System.out.println(multiply(2, 5));  //10
        System.out.println(multiply(2, 5, 8));  //80
        System.out.println(multiply(5, 1.2));  //6.0


    }

    //Create a method that multiplies two integers
    public  static int multiply(int a, int b){
        return a*b;
    }

    //Create a method that multiplies one double and one integer
    public  static double multiply(double a,int b){
        return  a*b;
    }

    //Create a method that multiplies one integer and one double
    public static double multiply(int a,double b){
        return  a*b;
    }

    //Create a method that multiplies three integers
    public  static int multiply(int a,int b,int c){
        return  a*b*c;
    }














}
