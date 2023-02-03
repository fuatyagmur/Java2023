package day14_multidimensionalarraysarraylists;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {

        //Example 1: Type code to find the multiplication of all elements of multidimensional array
        //           [ [5, 4], [10, 6, 3] ] ==> 3600

        int a[][]={ {5,4} , {10,6,3}};

        int multipilication = 1;

        for (int []w:a) {
            for (int k:w) {
                multipilication = multipilication * k;
            }

        }

        System.out.println("multipilication = " + multipilication);  //multipilication = 3600


        //Example 1: Type code to find the multiplication of all elements of multidimensional array
        //           [ [5, 4], [10, 6, 3] ] ==> 3600


        int f[][]=new int[2][3];

         f[0][0]=5;
         f[0][1]=4;
         f[0][2]=3;

         f[1][0]=7;
         f[1][1]=8;
         f[1][2]=9;


        System.out.println(Arrays.deepToString(f));  //[[5, 4, 3], [7, 8, 9]]

        int multipilication2=1;

        for (int []w:f) {

            for (int i:w) {

                multipilication2 = multipilication2 * i;


            }

        }

        System.out.println(multipilication2);  //30240








    }
}
