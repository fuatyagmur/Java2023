package day07_ifstatementternarystatement;

public class Ternary01 {

    public static void main(String[] args) {

        //Ex 1: Type code to check if a number is even or not by using ternary

        int num=8;

        //1. way: use if-else
        if (num%2==0){System.out.println("Even");}else {System.out.println("Odd");}



        //2. way: Ternary
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("result = " + result);


        //Ex 2: Type code to check if a number has 3 digits or not, use ternary

        int n=143;

        n= Math.abs(n);  // If we use negative digits, it ll change to positive  --> Math.abs(n)

        String r = n > 99 && n < 1000 ? "It has 3 digits" : "It has no 3 digits";
        System.out.println("r = " + r);


    }
}
