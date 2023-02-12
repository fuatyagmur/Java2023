package practices.lists;

import java.util.ArrayList;
import java.util.List;

public class lists02 {

    public static void main(String[] args) {

       // 2) Find the sum of all list elements min then 13 in an integer list

        List<Integer> myList=new ArrayList<>();

        myList.add(3);
        myList.add(6);
        myList.add(19);
        myList.add(12);
        myList.add(13);
        myList.add(15);
        myList.add(17);

        System.out.println("myList = " + myList);

        int sum=0;




        for (int w:myList) {
            if (w<13){
                sum=sum+w;
            }

        }

        System.out.println("sum = " + sum); //30

        // 2) Find the sum of all list elements before the first occurrence of 13 in an integer list

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(12);
        myList2.add(31);
        myList2.add(7);
        myList2.add(13);
        myList2.add(10);

        System.out.println("myList2 = " + myList2);  //myList2 = [12, 31, 7, 13, 10]

        int total = 0;
        for(Integer w : myList2){
            if(w==13){ break;
            }
            total = total + w;
        }

        System.out.println(total);


    }
}
