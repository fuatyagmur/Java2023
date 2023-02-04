package day14_multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

        //How to check if two lists are same or not
        List<String> names1=new ArrayList<>();
        names1.add("Tom");
        names1.add("Angie");
        names1.add("Mark");


        List<String> names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Angie");
        names2.add("Mark");

        boolean r3=names1.equals(names2);
        System.out.println("r3 = " + r3);



        //Example 1:Type code to check if two lists have same elements.
        //          Same elements can be in different indexes.
        //          [A, B, C] and [A, C, B] and [B, A, C] etc ==> true

        List<Character> m=new ArrayList<>();
        m.add('A');
        m.add('B');
        m.add('C');


        List<Character> x=new ArrayList<>();
        x.add('A');
        x.add('C');
        x.add('B');


        List<Character> z=new ArrayList<>();
        z.add('B');
        z.add('A');
        z.add('C');

        Collections.sort(m);    //Collections.sort puts the elements in alphabetical order
        Collections.sort(x);
        Collections.sort(z);

        boolean r4=m.equals(x);
        System.out.println("r4 = " + r4);




    }
}
