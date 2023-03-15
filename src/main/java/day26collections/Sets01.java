package day26collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sets01 {

      /*
        Sets are for storing unique data.
        There are 3 sets i)HashSet: Uses hashing technique.
                                    Hashing technique is a technique to create unique data(code)
                                    HashSet does not put the elements in any order, so HashSet is so fast
                                    HashSet allows you to store just one "null" as value
                         ii)LinkedHashSet: LinkedHashSet puts the elements in "insertion order"
                                           that is why it is slower than HashSet
                         iii)TreeSet: TreeSet puts the elements in natural order, putting elements in natural order needs too much time
                                      that is why TreeSet is so slow.
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
        hs.add(19);
        hs.add(14);//When you add same element repeatedly, Java does not give error. It puts the repeated element just once into the set.

        hs.add(null);
        hs.add(null);
        System.out.println(hs);// [null, 34, 3, 19, 5, 6, 23, 12, 14, 63]

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();

        lhs.add(12);
        lhs.add(3);
        lhs.add(14);
        lhs.add(5);
        lhs.add(34);
        lhs.add(63);
        lhs.add(6);
        lhs.add(23);
        lhs.add(19);
        lhs.add(14);
        lhs.add(null);
        lhs.add(null);

        System.out.println("lhs = " + lhs);  //lhs = [12, 3, 14, 5, 34, 63, 6, 23, 19, null]
        // --> LinkedHashSet puts the elements in "insertion order"



        LinkedHashSet<Integer> myLhs=new LinkedHashSet<>();

        myLhs.add(12);
        myLhs.add(31);
        myLhs.add(14);
        myLhs.add(53);
        myLhs.add(34);

        System.out.println("myLhs = " + myLhs);  //myLhs = [12, 31, 14, 53, 34]

        //lhs.retainAll(myLhs);

        System.out.println("lhs = " + lhs);  //lhs = [12, 14, 34]

        boolean r1=lhs.retainAll(myLhs);  // retainAll() method does not touch myLhs which is the method inside the parenthesis

        System.out.println("lhs = " + lhs);  //lhs = [12, 14, 34]
        System.out.println("r1 = " + r1);  //true
        System.out.println("myLhs = " + myLhs);  //myLhs = [12, 31, 14, 53, 34]


    }








}
