package day03_nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1: Get shirtPrice and shoePrice from user and print the total price on the console

        /*

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter shirtPrice");
        byte shirtPrice=scan.nextByte();

        System.out.println("Enter shoesPrice");
        byte shoesPrice= scan.nextByte();

        int totalPrice= shirtPrice+shoesPrice;

        System.out.println("Total Price is: "+ totalPrice);

        //if I use int it ll give exception by using 34.65 as a price. So it should be double.

         */

        Scanner input=new Scanner(System.in);

        System.out.println("Give me shirtPrice,please... ");
        double shirt=input.nextDouble();

        System.out.println("Give me shoesPrice,please...");
        double shoes=input.nextDouble();

        System.out.println("Total price is: "+(shirt+shoes));







    }












}
