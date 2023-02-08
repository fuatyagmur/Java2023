package practices.array;

import java.util.Arrays;

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
        System.out.println("The number of vowels: "+ counter);  //The number of vowels: 17










    }
}
