package practices.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lists06_removeElement {

    public static void main(String[] args) {

        //If a list has 15 or 13, remove them.
        //Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

        List<Integer> myList=new ArrayList<>(Arrays.asList(10,31,15,13,54));
        List<Integer> toRemove=new ArrayList<>();

        //1.way:

        for (int i = 0; i <myList.size() ; i++) {
            if (myList.get(i)==15 || myList.get(i)==13){

                toRemove.add(myList.get(i));

            }

        }
        myList.removeAll(toRemove);

        System.out.println("myList = " + myList);  //myList = [10, 31, 54]


        //2.way:

        List<Integer> myList2=new ArrayList<>(Arrays.asList(10,31,15,13,54));

        myList2.removeIf(n->(n==13 || n==15));
        System.out.println("myList2 = " + myList2);  //myList2 = [10, 31, 54]

        //3.way:

        List<Integer> myList3=new ArrayList<>(Arrays.asList(10,31,15,13,54));
        List<Integer>  newList=new ArrayList<>();

        for (Integer w:myList) {
            if (w!=15 || w!=13){
                newList.add(w);
            }

        }

        System.out.println("newList = " + newList);  //newList = [10, 31, 54]

        //4.way:


        List<Integer> h = new ArrayList<>(); h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);
        if(!h.contains(15) && !h.contains(13)){ System.out.println("The list does not contain 13 and 15");
        }else {
            for (int i = 0; i < h.size(); i++) {
                if (h.get(i) == 15) {
                    int idx15 = h.indexOf(15); h.remove(idx15);
                    i--;
                }
                if (h.get(i) == 13) {
                    int idx13 = h.indexOf(13); h.remove(idx13);
                    i--;
                }
            }
            System.out.println(h);
        }





    }
}
