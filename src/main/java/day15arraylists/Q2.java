package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    public static void main(String[] args) {

        //Example 1: Create an integer list, add 5 elements into it, change the elements less than 10 to 77


        List<Integer> myList=new ArrayList<>();
        myList.add(13);
        myList.add(8);
        myList.add(10);
        myList.add(67);
        myList.add(13);
        System.out.println("myList = " + myList);  //myList = [13, 8, 10, 67, 13]

        //1,way for loop
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i)<10){
                myList.set(i,77);
            }

        }
        System.out.println("myList = " + myList);  //myList = [13, 77, 10, 67, 13]

        //2.way for each loop

        for (Integer w:myList) {
            if (w<10){
                myList.set(w,77);   // we can also use this methode--> myList.set(myList.indexOf(w),77)
            }

        }
        System.out.println("myList = " + myList);  //myList = [13, 77, 10, 67, 13]


        //Example 2: Create an integer list and remove the duplications
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> yourList=new ArrayList<>();
        yourList.add(2);
        yourList.add(3);
        yourList.add(2);
        yourList.add(2);
        yourList.add(5);
        System.out.println("yourList = " + yourList);
        
        //1. way

        List<Integer> noDuplication=new ArrayList<>();

        for (Integer w:yourList) {
            if (!noDuplication.contains(w)){
                noDuplication.add(w);
            }

        }
        System.out.println("noDuplication = " + noDuplication);

        //2.way: for loop

        for (int i = 0; i < yourList.size() ; i++) {
            int el= yourList.get(i);   //el= 2 3 2 2 5

            if (yourList.indexOf(el)!=yourList.lastIndexOf(el)){
                yourList.remove(el);  //remove method removes first index if it duplicates

                i--;

            }

        }

        System.out.println("yourList = " + yourList);  //yourList = [2, 3, 5]


        //3.way
        for (int i = 0; i < yourList.size() ; i++) {
            if (yourList.indexOf(i)!=yourList.lastIndexOf(i)){
                yourList.remove(i);

                i--;

            }

        }

        System.out.println("Another way: "+yourList);  //Another way: [2, 3, 5]


    }
}
