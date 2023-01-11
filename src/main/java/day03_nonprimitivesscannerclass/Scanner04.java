package day03_nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        /*
            Type a program which calculates the volume of a rectangular prism
            whose length, width, and height are entered by user.
            Hint 1: Volume of a rectangular prism is width x length x height
         */

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the length of rectangular prsim: ");
        int length=input.nextInt();

        System.out.println("Please enter the width of rectangular prsim: ");
        int width=input.nextInt();

        System.out.println("Please enter the height of rectangular prsim: ");
        int height=input.nextInt();

        System.out.println(" volume of a rectangular prism is: "+ (length*width*height));







    }
}
