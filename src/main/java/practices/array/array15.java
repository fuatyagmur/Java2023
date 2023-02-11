package practices.array;

import java.util.Arrays;
import java.util.Scanner;

public class array15 {

    public static void main(String[] args) {

        //Ask the user to enter 2 Strings.
        // If the characters and the numbers of characters of the Strings are the same then print "Anagram" on the console.
        // Otherwise, print "Not Anagram" on the console.
        // Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Strings");

        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);

        String a2[]=s2.toLowerCase().split("");
        Arrays.sort(a2);

        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Not anagram");
        } else if (Arrays.equals(a1, a2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }





    }
}
