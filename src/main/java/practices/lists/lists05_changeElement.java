package practices.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lists05_changeElement {

    public static void main(String[] args) {

        //If the list has 15 as element, change all 15s to 51
        //Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)

        List<Integer> g=new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(43);

        System.out.println("g = " + g);  //g = [12, 11, 15, 34, 43]

        if (g.contains(15)){
            for (int w:g) {
                if (w==15){
                    int idx=g.indexOf(15);
                    g.set(idx,51);
                }

            }

            System.out.println("g = " + g);  //g = [12, 11, 51, 34, 43]
        }else {
            System.out.println("There is no expected element.");
        }


        //2.way:

        List<Integer> myList = new ArrayList<>(Arrays.asList(12, 11, 15, 34, 43));

        if (myList.contains(15)) {
            Collections.replaceAll(myList, 15, 51);
        }

        System.out.println(myList);  //[12, 11, 51, 34, 43]


        //3.way:

        List<Integer> myList2=new ArrayList<>(Arrays.asList(12,11,15,34,54));
        System.out.println("myList2 = " + myList2);  //myList2 = [12, 11, 15, 34, 54]

        for (int i = 0; i <myList2.size() ; i++) {

            if (myList2.get(i)==15){

                myList2.set(i,51);
            }

        }

        System.out.println("myList2 = " + myList2);  //myList2 = [12, 11, 51, 34, 54]






    }
}
