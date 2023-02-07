package practices.array;

import java.util.Arrays;

public class array04 {

    public static void main(String[] args) {

        //Find the elements whose length is the smallest in a String array
        //Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli


/*

         This is fault because it gives also "kemal" as an answer.

        String [] a=new String[] {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        System.out.println(Arrays.toString(a));  //[Kemal, Jonathan, Mark, Angie, Veli]

        int minLength= a[0].length();

        for (int i = 0; i <a.length ; i++) {

               minLength= Math.min(minLength,a[i].length());

               if (minLength==a[i].length()){
                   System.out.print(a[i]+" ");
               }
        }

 */

        //1.way: for loop

        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLength = b[0].length();

        for (int i = 0; i < b.length; i++) {
            minLength = Math.min(minLength, b[i].length());
        }

        for (int i = 0; i < b.length; i++) {
            if (minLength == b[i].length()) {
                System.out.print(b[i]+" ");  //Mark Veli
            }
        }

        System.out.println();


        //2.way:for each loop

        String[] c = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLengthC = b[0].length();

        for (String w:c) {
            minLengthC=Math.min(minLengthC,w.length());

            }
        for (String w:c) {
            if (minLengthC==w.length()){
                System.out.print(w+" ");  //Mark Veli
            }





        }









    }
}
