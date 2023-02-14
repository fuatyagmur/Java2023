package practices.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lists11_findUniqueElements {

    public static void main(String[] args) {

        //Check if all elements are unique in an integer List by using loops.

        List<Integer> myList=new ArrayList<>(Arrays.asList(10,31,15,7,15,23));

        Integer counter=0;

        for (Integer w:myList) {
            for (Integer k:myList) {

                if (w==k){
                    counter++;
                }

            }

        }

        if (counter==myList.size()){
            System.out.println("There is no repeated element");
        }else {
            System.out.println("At least one element was repeated");
        }









    }
}


