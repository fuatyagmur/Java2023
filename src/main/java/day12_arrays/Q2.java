package day12_arrays;

import java.sql.Array;
import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {

        //Example 2: Create a String Array, add 5 elements in it, type code to print
        //           the sum of all characters in all element on the console.

        String element[]= new String[5];

        element[0]="apple";
        element[1]="banana";
        element[2]="mango";
        element[3]="avocado";
        element[4]="coconut";

        System.out.println(Arrays.toString(element));  //[apple, banana, mango, avocado, coconut]

        System.out.println(element.length);  //5

        for (int i=0; i< element.length; i++){
            System.out.print(element[i] + " ");  // apple banana mango avocado coconut
        }

        System.out.println();

        //This way is not dynamic
        System.out.println(element[0].length() + element[1].length() +element[2].length() + element[3].length() + element[4].length() );

        //This way is dynamic

        int sum=0;

        for (int i=0; i< element.length; i++){
            sum = sum + element[i].length();
        }

        System.out.println("sum = " + sum);


        //Another way:  for each loop

        int total=0;

        for (String w : element){
            total=total+w.length();

        }

        System.out.println("total = " + total);


    }
}
