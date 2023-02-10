package practices.array;

import java.util.Arrays;

public class array12 {

    public static void main(String[] args) {

        //Type code to find sum of the number of characters of array elements

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        Integer sum = 0;

        for(String w : arr){
            sum = sum + w.length(); }
        System.out.println(sum);


        //Type code to find sum of the number of characters of array elements

        String[] fruits = new String[]{"apple", "banana", "cherry", "date", "elderberry"};

       int total=0;

        for (String j:fruits) {

            total=total + j.length();

        }

        System.out.println("total = " + total);



    }
}
