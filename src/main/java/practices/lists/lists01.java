package practices.lists;

import java.util.ArrayList;
import java.util.List;

public class lists01 {

    public static void main(String[] args) {

       // 1) Find the sum of all list elements in an integer list

        List<Integer> myList=new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(1);
        myList.add(9);
        myList.add(11);

        System.out.println(myList);

        int sum=0;

        for (int w:myList) {

            sum=sum + w;

        }

        System.out.println("sum = " + sum);


    }
}
