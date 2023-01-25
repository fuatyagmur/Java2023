package day11_nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        //Example 4: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= input.nextInt();

        int sumOfDigits=0;

        number=Math.abs(number);



        while (number>0){
            sumOfDigits= sumOfDigits + number%10;

            number=number/10;

        }

        System.out.println("sumOfDigits = " + sumOfDigits);


        //Same question with for loop





        int f=123;
        int sumDigits=0;

        f=Math.abs(f);

        for (int i=f; i>0; i/=10){

            sumDigits=sumDigits + i %10;

        }

        System.out.println("sumDigits = " + sumDigits);




        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int sum = 0;

        num=Math.abs(num);

        for (int i = num; i != 0; i /= 10) {
            sum += i % 10;
        }

        System.out.println("Sum of digits: " + sum);


    }
}
