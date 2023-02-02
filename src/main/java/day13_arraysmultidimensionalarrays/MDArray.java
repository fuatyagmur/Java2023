package day13_arraysmultidimensionalarrays;

import java.util.Arrays;

public class MDArray {
    public static void main(String[] args) {

        //How to create multidimensional array
        int arr[][]=new int[4][2];

        System.out.println(Arrays.toString(arr)); //[[I@7dc36524, [I@35bbe5e8, [I@2c8d66b2, [I@5a39699c]
        System.out.println(Arrays.deepToString(arr));  //[[0, 0], [0, 0], [0, 0], [0, 0]]

        //How to add elements into a multidimensional array

         arr[0][0] = 3;
         arr[0][1] = 32;

         arr[1][0] = 7;
         arr[1][1] = 42;

         arr[2][0] = 22;
         arr[2][1] = 52;

         arr[3][0] = 2;
         arr[3][1] = 52;

        System.out.println(Arrays.deepToString(arr));  //[[3, 32], [7, 42], [22, 52], [2, 52]]  so we should use deepTostring
        System.out.println(Arrays.toString(arr));      //[[I@7dc36524, [I@35bbe5e8, [I@2c8d66b2, [I@5a39699c]


        //How to print the element from outer array

        System.out.println(arr);  //[[I@3cb5cdba   fault

        System.out.println(Arrays.toString(arr[1]));  //[7, 42]
        System.out.println(Arrays.toString(arr[0]));  //[3, 32]

        //How to print elements one by one

        System.out.println(arr[0][0]);  //3
        System.out.println(arr[2][0]);  //22


















    }
}
