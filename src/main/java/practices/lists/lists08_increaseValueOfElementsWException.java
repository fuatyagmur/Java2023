package practices.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lists08_increaseValueOfElementsWException {

    public static void main(String[] args) {


        //Increase the value of every element except 7 and 10 by 2 in a List
        // Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)

        List<Integer> h= Arrays.asList(12,31,7,13,10);
        for (int w:h) {
            if (w==7 || w==10){
                continue;
            }
                h.set(h.indexOf(w), w + 2);


        }

        System.out.println("h = " + h);  //h = [14, 33, 7, 15, 10]

        //2.way

        int [] list= {12, 31, 7, 13, 10};

        for (int i = 0; i <list.length ; i++) {

            if (list[i]!=7 && list[i]!=10){
                list[i]+=2;
            }

        }

        System.out.println(Arrays.toString(list)); //[14, 33, 7, 15, 10]

        //3.way : Better way


        List<Integer> myList=new ArrayList<>(Arrays.asList(12, 31, 7, 13, 10));

        for (int i = 0; i <myList.size() ; i++) {
            if (myList.get(i)!=7 && myList.get(i)!=10){
                myList.set(i,myList.get(i)+2);
            }

        }
        System.out.println(myList);  //[14, 33, 7, 15, 10]


        //4.way

        List<Integer> listt = new ArrayList<>(Arrays.asList(12, 31, 7, 13, 10));

        for (int i = 0; i < listt.size(); i++) {
            int value = listt.get(i);
            if (value != 7 && value != 10) {
                listt.set(i, value + 2);
            }
        }

        System.out.println(listt);  //[14, 33, 7, 15, 10]

    }
}
