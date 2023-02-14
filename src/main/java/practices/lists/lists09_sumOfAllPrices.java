package practices.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lists09_sumOfAllPrices {

    public static void main(String[] args) {

        //Find the sum of all prices given in a String list
        //Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String > myList=new ArrayList<>(Arrays.asList("$12.99", "$23.60", "$54.45"));

        double sum=0;

        for (String w:myList) {

            Double price=Double.valueOf(w.replace("$",""));
            sum=sum+price;


        }

        System.out.println("sum = " + sum);  //sum = 91.04

        //2.way

        List<String> myList2 = Arrays.asList("$12.99", "$23.60", "$54.45");
        double total = 0.0;
        for (String price : myList2) {
            String digits = price.replaceAll("[^0-9.]", ""); // extract digits and decimal point
            total += Double.parseDouble(digits);
        }
        System.out.println(total); // output: 91.04


    }
}
