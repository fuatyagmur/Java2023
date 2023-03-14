package day25collections;

import java.util.HashSet;

public class Sets01 {

     /*
        Sets are for storing unique data.
        There are 3 sets i)HashSet: Uses hashing technique.
                                    Hashing technique is a technique to create unique data(code)
                                    HashSet does not put the elements in any order, so HashSet is so fast
                                    HashSet allows you to store just one "null" as value
                         ii)LinkedHashSet
                         iii)TreeSet
     */

    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();

        hs.add(12);
        hs.add(3);
        hs.add(14);
        hs.add(5);
        hs.add(34);
        hs.add(63);
        hs.add(6);
        hs.add(23);
        hs.add(14);

        System.out.println("hs = " + hs);  //hs = [34, 3, 5, 6, 23, 12, 14, 63]


    }








}
