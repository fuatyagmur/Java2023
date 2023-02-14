package practices.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lists04_descendingOrder {

    public static void main(String[] args) {

//        Check if elements are in descending order in a list
//        Example: (Yellow, Blue, Red, Green) ==> Output: It is not in descending order
//        (Yellow, Red, Green, Blue) ==> Output: It is in descending order

        List<String > e=new ArrayList<>();
        e.add("Yellow");
        e.add("Blue");
        e.add("Red");
        e.add("Green");

        System.out.println("e = " + e);  //e = [Yellow, Blue, Red, Green]

        List<String> f=new ArrayList<>();
        f.addAll(e);

        Collections.sort(f);

        System.out.println("e = " + e);  //e = [Yellow, Blue, Red, Green]
        System.out.println("f = " + f);  //f = [Blue, Green, Red, Yellow]

        int size=e.size();
        int flag=0;

        for (int i = 0; i <size ; i++) {
            if (f.get(i).equals(e.get(size-1-i))){
                flag++;
            }

        }

        if (flag==size){
            System.out.println("It is in descending order");
        }else {
            System.out.println("It is not in descending order");
        }





    }
}
