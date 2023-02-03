package day14_multidimensionalarraysarraylists;

public class Q3 {

    public static void main(String[] args) {

        //Example 1: Find the sum of the minimum and maximum elements in a multidimensional array
        //           [ [5, 4], [10, 6, 7] ] ==> 4 + 10 = 14 ==> 14

        int a[][] = { {5,4} , {10,6,7} , {-3,9,23} };

        int smal=a[0][0];
        int big=a[0][0];
        for (int [] w:a) {

            for (int k:w) {

                smal = Math.min(smal,k);
                big = Math.max(big,k);

            }

        }

        System.out.println("smal = " + smal);
        System.out.println("big = " + big);
        System.out.println(smal+big);


    }
}
