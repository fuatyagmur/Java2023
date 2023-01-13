package day04_stringmanipulations;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        //Example 1: Get the initials of a name which contains first name and last name
        //           Tom Hanks ==> TH

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name and  last name,pls: ");
        String fullName = scan.nextLine();   //Tom Hanks

        char first = fullName.charAt(0);      //indexes start with "0"
        char last = fullName.split(" ")[1].charAt(0);

        System.out.println(first+" "+ last);


        System.out.println("Enter your name and  last name,pls: ");
        String name = scan.nextLine();   // Alexander Graham Bell

        char firstName = name.charAt(0);
        char secondName = name.split(" ")[1].charAt(0);
        char lastName = name.split(" ")[2].charAt(0);

        System.out.println(firstName+" "+ secondName+" "+lastName);



























    }
}
