package practices.array;

import java.util.Arrays;
import java.util.Scanner;

public class array09 {
    public static void main(String[] args) {

      //  Find the number of vowels in a String

        String s = "Apex is an object oriented programming language";
        String[] arr = s.toLowerCase().split("");
        System.out.println(Arrays.toString(arr));  //[a, p, e, x,  , i, s,  , a, n,  , o, b, j, e, c, t,
        // , o, r, i, e, n, t, e, d,  , p, r, o, g, r, a, m, m, i, n, g,  , l, a, n, g, u, a, g, e]

        int counter=0;

        for (String w:arr) {
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":

                    counter++;

            }

        }

        System.out.println("The number of vowels is " + counter);






        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);










    }
}
