package practices.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lists03 {

    public static void main(String[] args) {

      //  Find the multiplication of all even list elements in an integer list

        List<Integer> myList=new ArrayList<>();

        myList.add(3);
        myList.add(6);
        myList.add(4);
        myList.add(2);
        myList.add(-5);


        System.out.println("myList = " + myList);  //myList = [3, 6, 4, 2, -5]

        Collections.sort(myList);
        System.out.println("myList = " + myList);  //myList = [-5, 2, 3, 4, 6]
        Collections.reverse(myList);
        System.out.println("myList = " + myList);  //myList = [6, 4, 3, 2, -5]

        int multiplication=1;
        for (Integer w:myList) {
            if (w%2==0){
                multiplication= w * multiplication;
            }

        }

        System.out.println("multiplication = " + multiplication); //multiplication = 48



        //Another way

        List<Integer> myList2= new ArrayList<>();
        myList2.add(12);
        myList2.add(31);
        myList2.add(7);
        myList2.add(13);
        myList2.add(10);
        int m = 1;
        for(Integer w : myList2){
            if(w%2!=0){
                continue;
            }
            m = m * w; }
        System.out.println(m);  //120


    }
}
