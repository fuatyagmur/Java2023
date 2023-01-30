package day12_arrays;

import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {

        //Example 1: Create a String Array, add 5 elements in it, type code to print
        //           the sum of the characters in the first and the last element on the console.
        //           Make your code dynamic


        String countries[]=new String[6];

        countries[0]="Turkey";
        countries[1]="Netherlands";
        countries[2]="Belgium";
        countries[3]="France";
        countries[4]="Germany";
        countries[5]="USA";

        System.out.println("countries = " + countries);  //[Ljava.lang.String;@71be98f5
        System.out.println("countries.toString() = " + countries.toString());  //[Ljava.lang.String;@71be98f5

        System.out.println(Arrays.toString(countries)); //[Turkey, Netherlands, Belgium, France, Germany, USA]

        //or

        for (int i=0; i<countries.length; i++){
            System.out.println(countries[i] + " ");
        }





        int lengthOfArray=countries.length;
        System.out.println(lengthOfArray);  //6






        String somOfFirst=countries[0];
        System.out.println("somOfFirst = " + somOfFirst);

        String somOfLast=countries[5];
        System.out.println("somOfLast = " + somOfLast);

        String somOfTotal=somOfFirst+" "+somOfLast;
        System.out.println("somOfTotal = " + somOfTotal);


        int first=countries[0].length();
        System.out.println("first = " + first);

        int last=countries[5].length();
        System.out.println("last = " + last);

        //or

        int lasstt=countries[countries.length-1].length();   //it makes dynamic
        System.out.println("lasstt = " + lasstt);



        int totalChar=first+last;
        System.out.println("totalChar = " + totalChar);

        //or

        System.out.println(first+last);


    }
}
