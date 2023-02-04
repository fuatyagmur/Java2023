package day14_multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

    public static void main(String[] args) {

        //How to create an ArrayList
        //1.Way:

        ArrayList<Integer> ages=new ArrayList<>();
        System.out.println("ages = " + ages);  //ages = []

        //2.Way:
        List<Integer> prices= new ArrayList<>();
        System.out.println("prices = " + prices);  //prices = []

        //How to add elements into an ArrayList
        //Note: add() method puts the element to the end
        //      add() method puts the elements in "insertion order"

        ages.add(13);
        ages.add(9);
        ages.add(21);
        System.out.println(ages);   //[13, 9, 21]

        ages.add(2,5);
        System.out.println(ages);

        prices.add(330);
        prices.add(550);
        prices.add(349);
        System.out.println(prices);  //[330, 550, 349]


        ages.addAll(prices);
        System.out.println(ages);  //[13, 9, 5, 21, 330, 550, 349]


        // prices.clear();
        //System.out.println(prices);  //[]

        boolean r1=ages.contains(44);
        System.out.println(r1);

        boolean r2=ages.containsAll(prices);
        System.out.println(r2);






    }
}
