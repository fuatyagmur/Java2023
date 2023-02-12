package practices.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lists07_closestIntegers {

    public static void main(String[] args) {

        //Find the closest 2 integers in an Integer List
        //Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13

        List<Integer> h=new ArrayList<>(Arrays.asList(12,31,15,13,54));

        Collections.sort(h);
        System.out.println("h = " + h);  //h = [12, 13, 15, 31, 54]

        int minDiff=h.get(2)-h.get(1);

        for (int i=1; i<h.size(); i++){
            minDiff=Math.min(minDiff,h.get(i)-h.get(i-1));
        }

        for (int i = 1; i <h.size() ; i++) {
            if (h.get(i)-h.get(i-1) == minDiff){
                System.out.println(h.get(i)+ " and " + h.get(i-1));
            }

        }


//        List<Integer> k = new ArrayList<>();
//        k.add(12);
//        k.add(31);
//        k.add(15);
//        k.add(13);
//        k.add(54);
//        Collections.sort(k);
//        int minDifff = k.get(2) - k.get(1);
//        for(int i=1; i<k.size(); i++){
//            minDifff = Math.min(minDifff, k.get(i)-k.get(i-1));
//        }
//        for(Integer i=1; i<k.size(); i++){
//            if(k.get(i)-k.get(i-1) == minDifff ){ System.out.println(k.get(i) + " and " + k.get(i-1));
//            } }


        //2.way:

        List<Integer> list = Arrays.asList(12, 31, 15, 13, 54);
        Collections.sort(list);
        int minDifff = Integer.MAX_VALUE;
        int firstNum = 0, secondNum = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            int diff = list.get(i + 1) - list.get(i);
            if (diff < minDifff) {
                minDifff = diff;
                firstNum = list.get(i);
                secondNum = list.get(i + 1);
            }
        }

        System.out.println("The closest two integers in the list are " + firstNum + " and " + secondNum);




    }
}
