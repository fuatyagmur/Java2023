package day14_multidimensionalarraysarraylists;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {


        //Example 1: Convert 2 dimensional array to 1 dimensional array
        //           [ [5, 3], [9, 8, 7] ] ==> [5, 3, 9, 8, 7]

        int a[][]=  { {5,3} , {9,8,7} };

        //1. Step: Find the number of elements in the multidimensional array
        int sum = 0;

        for (int[] w:a) {
            sum = sum + w.length;

        }
        System.out.println("sum = " + sum);


        //2. Step: Create new 1 dimensional array whose length is the same
        //         with number of elements in the multidimensional array

        int b[]= new int[sum];




        //3. Step: Transfer the elements from the multidimensional array to the 1 dimensional array

        int idx=0;

        for (int[] w:a) {

            for (int k:w) {

                b[idx]=k;

                idx++;


            }

        }

        System.out.println(Arrays.toString(b));




        //Example 1: Convert 2 dimensional array to 1 dimensional array
        //           [ [5, 3], [9, 8, 7] ] ==> [5, 3, 9, 8, 7]

        int[][] f={ {5,6} , {7,8,9} , {0,1,2} };

        //1. Step: Find the number of elements in the multidimensional array

        int counter=0;

        for (int [] w:f) {

            counter = counter + w.length;

        }

        System.out.println("counter = " + counter);  // 8


        //2. Step: Create new 1 dimensional array whose length is the same
        //         with number of elements in the multidimensional array

        int y[]=new int[counter];

        //3. Step: Transfer the elements from the multidimensional array to the 1 dimensional array

        int index=0;

        for (int []w:f) {
            for (int i:w) {

                y[index]=i;

                index++;

            }

        }

        System.out.println(Arrays.toString(y));



        //Example 1: Convert 2 dimensional array to 1 dimensional array
        //           [ [5, 3], [9, 8, 7] ] ==> [5, 3, 9, 8, 7]
        //1. Step: Find the number of elements in the multidimensional array
        //2. Step: Create new 1 dimensional array whose length is the same
        //         with number of elements in the multidimensional array
        //3. Step: Transfer the elements from the multidimensional array to the 1 dimensional array

        //1. Step: Find the number of elements in the multidimensional array

        int g[][]={{0,1,2,3},{4,5},{6,7,8,9}};

        int sayac=0;

        for (int []w:g) {

            sayac = sayac + w.length;

        }

        System.out.println("sayac = " + sayac);

        //2. Step: Create new 1 dimensional array whose length is the same
        //         with number of elements in the multidimensional array

        int h[]=new int[sayac];
        System.out.println(Arrays.toString(h));  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(h.length);  //10

        //3. Step: Transfer the elements from the multidimensional array to the 1 dimensional array

        int index2=0;

        for (int []w:g) {
            for (int j:w) {

                h[index2]=j;

                index2++;

            }

        }

        System.out.println(Arrays.toString(h));




    }
}
