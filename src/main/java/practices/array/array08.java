package practices.array;

import java.util.Arrays;

public class array08 {
    public static void main(String[] args) {

       // Count how many words start with 'a' or 'A' in a given String

        String s = "Apex is an object oriented programming language";

        String [] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));  //[Apex, is, an, object, oriented, programming, language]
        int counter=0;

        for (String w:arr) {

            if (w.startsWith("a") || w.startsWith("A")){
                counter++;
            }

        }

        System.out.println("The number of words which starts with a or A is : " + counter);  //2


        // Count how many words end with 's' or 'h' in a given String

        String a="The number of words which starts with a or A is";

        String[] arr2=a.split(" ");
        System.out.println(Arrays.toString(arr2));  //[The, number, of, words, which, starts, with, a, or, A, is]

        int count=0;

        for (String w:arr2) {

            if (w.endsWith("s") || w.endsWith("h")){
                count++;
            }

        }

        System.out.println("count = " + count);  //count = 5


    }
}
