package day07_ifstatementternarystatement;

import java.util.Scanner;

public class NestedIfStatement01 {

    public static void main(String[] args) {

        //Example 1: If the worker is male and the age is greater than 65 he ll be retired otherwise he should work
        //          If the worker is female and the age is greater than 65 he ll be retired otherwise he should work
        //          If the worker doesnt define himself as male or female print "undefined" on the console

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your gender like Male, Female or Others ");
        String gender=input.next();

        System.out.println("Enter your age..");
        byte age=input.nextByte();

        if (age<0){
            System.out.println("Invalid age");
        }

        if (gender.equalsIgnoreCase("Male")){
            if (age<66){
                System.out.println("He should work");
            }else {
                System.out.println("He should be retired");
            }

        }else  if (gender.equalsIgnoreCase("Female")){

             if (age<61){
                System.out.println("He should work");
            }else {
                System.out.println("He should be retired");
            }

        }else {
            System.out.println("Undefined");
        }
















    }
}
