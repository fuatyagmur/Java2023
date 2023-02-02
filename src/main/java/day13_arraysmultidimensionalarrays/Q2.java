package day13_arraysmultidimensionalarrays;

import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) {


        //Example 2: Create an integer array and print elements greater than 10 on the console.
        int nums[] = new int[7];
        nums[0] = 13;
        nums[1] = 6;
        nums[2] = 19;
        nums[3] = -8;
        nums[4] = 10;
        nums[5] = 2;
        nums[6] = 87;

        System.out.println();

        //1. way

        for (int w:nums) {
            if (w>10){
                System.out.print(w + " "); //13 19 87
            }

        }

        System.out.println();

        //2. way

        Arrays.sort(nums); // -8, 2, 6, 10, 13, 19, 87
        System.out.println(Arrays.toString(nums));

        for (int i = nums.length-1; i>=0; i-- ){
            if (nums[i]<=10){
                break;
            }else {
                System.out.print(nums[i] + " ");  //87 19 13
            }
        }

        System.out.println();

        //3.way   // -8, 2, 6, 10, 13, 19, 87

        for (int w:nums) {
            if (w<=10){
                continue;
            }else {
                System.out.print(w + " ");  //13 19 87
            }

        }

        System.out.println();





       // Create an integer array and print elements less than 10 on the console.

        int element[]=new int[5];

        element[0]=2;
        element[1]=22;
        element[2]=43;
        element[3]=5;
        element[4]=-34;

        //1. way

        for (int w:element) {
            if (w<10){
                System.out.print(w + " "); //2 5 -34
            }
        }

        System.out.println();

        //2.way
        Arrays.sort(element);
        System.out.println(Arrays.toString(element));  //[-34, 2, 5, 22, 43]

        for (int i = element.length-1; i >=0 ; i--) {
            if (element[i]<10){
                System.out.print(element[i] + " ");  // 5 2 -34
            }
        }

        System.out.println();

        //another way

        for (int i = 0; i <=element.length-1 ; i++) {
            if (element[i]>10){
                break;
            }else {
                System.out.print(element[i] + " ");
            }
        }

        System.out.println();

        //3.way

        for (int w:element) {
            if (w>=10){
                continue;
            }else {
                System.out.print(w + " ");  //-34 2 5
            }

        }













    }
}
