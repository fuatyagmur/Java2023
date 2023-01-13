package day04_stringmanipulations;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Get the full name of the user and make all characters in upper cases

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your first name and last name");
        String fullName = input.nextLine().toUpperCase(Locale.ROOT);

        //toUpperCase() method converts all characters to upper cases
        System.out.println(fullName);

        //Example 2: Get the full name of the user, make all characters in upper cases, and remove spaces
        //           from the beginning and from the end

        System.out.println("Please, enter your first name and last name");
        String name= input.nextLine().toUpperCase().trim();  //method chain

        //trim() method removes the "space" characters from the beginning and from the end.
        //trim() method does not touch spaces in the middle
        System.out.println(name);


        //Example 3: Get a String from a user, then count the number of characters in the String
        System.out.println("Enter a string: ");

        String s=input.nextLine();
        int numOfChars= s.length();

        System.out.println(numOfChars);




















    }
}
