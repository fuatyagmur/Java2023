package day13_arraysmultidimensionalarrays;

import java.sql.Array;
import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {

        //Example 1: Create an integer array and print elements less than 10 on the console.

        int age[]=new int[6];

        age[0]=3;
        age[1]=8;
        age[2]=12;
        age[3]=43;
        age[4]=32;
        age[5]=5;

        // 1 way

        for (int w : age) {
            if (w<10){
                System.out.print( w + " ");
            }

        }
        System.out.println();


        // 2.way
        Arrays.sort(age);

        System.out.println(Arrays.toString(age));

        for (int w:age) {
            if (w>=10){
                break;
            }else {
                System.out.print(w + " ");
            }

        }
        System.out.println();


        //Example 1: Create an integer array and print elements less than 10 on the console.

        int element[]=new int[5];

        element[0]=2;
        element[1]=22;
        element[2]=43;
        element[3]=5;
        element[4]=-34;

        for (int w:element) {
            if (w<=10){
                System.out.print( w + " ");
            }



        }

        System.out.println();


        int ints[]=new int[5];

        ints[0]=2;
        ints[1]=22;
        ints[2]=43;
        ints[3]=5;
        ints[4]=-34;

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        for (int w:ints) {
            if (w>=10){
                break;
            }else {
                System.out.print(w + " ");
            }

        }
        System.out.println();

        //another way

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();

        int[] arr1={-2,3,54,3,2,53,44,56,134};
        for (int i=0; i< arr1.length; i++){
            if (arr1[i]<10){
                System.out.print(arr1[i] + " ");
            }
        }

        System.out.println();


        int arr2[]={-7,0,3,15,-6,8,12,-54,234,78};
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));

        for (int w:arr2) {
            if (w<=10){
                System.out.print(w + " ");
            }else{
                break;
            }

        }
















    }
}
