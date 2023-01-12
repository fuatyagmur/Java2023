package practices.practice02;

public class Q01_Concatination {

    public static void main(String[] args) {

        //initialize variable
        int age=21;
        int weight=85;

        //Print variables with label
        System.out.println("age = " + age);
        System.out.println("weight = " + weight);

        //Copy the variable's value
        int myAge = age;
        System.out.println("myAge = " + myAge);

        //Declare multiple variables in the same line
        int year=2023,  month=1, day=12;

        System.out.println("day = " + day);
        System.out.println("month = " + month);
        System.out.println("year = " + year);

        //Update a variable
        day=13;
        System.out.println("day = " + day);

        //Declare a variable
        int x;

        //Initialize another variable: y
        int y = 12;
        System.out.println("y = " + y);

        //Initialize another variable: z
        int z = 10;

        //Initialize x by using z
        x=z;

        //Update the variables
        y=20;
        System.out.println("y = " + y);


    }

}
