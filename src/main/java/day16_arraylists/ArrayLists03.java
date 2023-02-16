package day16_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        //Example 1: Convert an Array to a List

        String a[] = new String[5];
        a[0]="Tom";
        a[1]="Ajda";
        a[2]="Cuneyt";
        a[3]="Angelina";
        a[4]="Brad";

        System.out.println(Arrays.toString(a));  //[Tom, Ajda, Cuneyt, Angelina, Brad]

        List<String> myList= Arrays.asList(a);

        System.out.println("myList = " + myList);  //myList = [Tom, Ajda, Cuneyt, Angelina, Brad]


//        System.out.println(myList);
//        myList.remove("Ajda");//UnsupportedOperationException

        // System.out.println(myList);

//        myList.add("Rambo");
//        System.out.println(myList);//UnsupportedOperationException

        /*
        When you need to convert an array object to a List, İf you use asList() it is used to create a List object from an Array object.
        Arrays are fixed in length, when you create a List from an Array the List will be fixed like an Array in length as well.Arrays gene/structure
        will be transferred to the List.

        So, if you are sure, you will not need to change the size of the List you created from an Array, you can use asList()
        otherwise do not use it.
         */

        //  *** 2.way from chatGPT  ***

        String[] myArray = {"apple", "banana", "orange"};
        List<String> myList2 = Arrays.asList(myArray);

        //Note that if you try to modify the list after converting it from an array,
        // you may get an UnsupportedOperationException if you try to add or remove elements from the list.
        // If you need a mutable list, you can create a new ArrayList object and pass the array to its constructor, like this:


        List<String> myList3 = new ArrayList<>(Arrays.asList(myArray));

        //This will create a new ArrayList object with the same elements as the original array,
        // which you can modify as needed.

        //Yes, you can modify the myList created using List<String> myList = new ArrayList<>(Arrays.asList(myArray));
        // as it is a new ArrayList object created with the elements from the original array.

        myList3.add("grape"); // adds "grape" to the end of the list
        myList3.remove("banana"); // removes the "banana" element from the list
        myList3.set(0, "pear"); // replaces the first element with "pear"

        System.out.println("myList3 = " + myList3);  //myList3 = [pear, orange, grape]


    }
}
