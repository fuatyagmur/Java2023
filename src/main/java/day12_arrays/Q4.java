package day12_arrays;

import java.util.Arrays;

public class Q4 {

    public static void main(String[] args) {

        //Example 1: Create a String array with 5 elements, delete the elements whose length is less than 5
        //           [Orange, Blue, Red, Yellow, Brown] ==> [Orange, Yellow, Brown]
        String colors[] = new String[5];
        colors[0] = "Orange";
        colors[1] = "Blue";
        colors[2] = "Red";
        colors[3] = "Yellow";
        colors[4] = "Brown";

        int counter=0;


        //How many elements have greater than or equal to 5 characters
        for (String w:colors) {
            if (colors.length<=5){

                counter++;

            }

        }

        System.out.println(counter);


        String[] newArray=new String[counter];
        int idx=0;

        for (String w:colors) {
            if (w.length()>=5){
                newArray[idx]=w;

                idx++;

            }

            
        }

        System.out.println(Arrays.toString(newArray));







    }
}
