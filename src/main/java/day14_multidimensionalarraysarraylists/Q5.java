package day14_multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class Q5 {

    public static void main(String[] args) {

         /*
        When you talk about "Arrays" use "Array's length"
        When you talk about "Lists" use "List's size"
     */



        //Example 1: Type code to print the elements of a list if the elements is greater than the number of elements in the list
        //           [5, 9, 3, 4, 6] ==> 9 - 6

        List<Integer> nums=new ArrayList<>();
        nums.add(13);
        nums.add(5);
        nums.add(6);
        nums.add(9);
        nums.add(3);



        //1.Step: Find the number of list elements
        int numOfEl=nums.size();    //if we do smthg with array we use nums.length  but in list we use nums.size

        //2. Step: Check if an element is greater than the number of list elements then print it

        for (Integer w:nums) {
            if (w>numOfEl){
                System.out.print(w + " ");
            }

        }








    }
}
