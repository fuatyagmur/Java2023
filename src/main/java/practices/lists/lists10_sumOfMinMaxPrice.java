package practices.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lists10_sumOfMinMaxPrice {

    public static void main(String[] args) {

        //Find the sum of the least and the greatest price given in a String list
        //Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String > f= Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");

        List<Double> decimalList = new ArrayList<>();

        for (String w:f) {
            Double price=Double.valueOf(w.replace("$",""));
            decimalList.add(price);

        }

        Collections.sort(decimalList);
        Double sum=decimalList.get(0) + decimalList.get(decimalList.size()-1);

        System.out.println("sum = " + sum);  //sum = 62.7


        //2.way

        List<String > myList= Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        double minPrice=Double.MAX_VALUE;
        double maxPrice=Double.MIN_VALUE;

        for (String price:myList) {

            String digits= price.replaceAll("[^0-9.]","");
            Double priceValue=Double.parseDouble(digits);

            if (priceValue<minPrice){
                minPrice=priceValue;
            }

            if (priceValue>maxPrice){
                maxPrice=priceValue;
            }

        }

        double total=maxPrice+minPrice;
        System.out.println("total = " + total);  //total = 62.7


    }
}
