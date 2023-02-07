package practices.array;

import java.util.Arrays;

public class array03 {

    public static void main(String[] args) {

        //Find the smallest positive element and greatest negative element in an integer array
        //  Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, the greatest negative is -2

        //1.way

        int [] a=new int[]{-12,18,-5,23,-2};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));  //[-12, -5, -2, 18, 23]

        int minPositive= a[a.length-1];
        int maxNegative=a[0];

        System.out.println("minPositive = " + minPositive);  //23
        System.out.println("maxNegative = " + maxNegative);  //-12

        //It's for comparing in the loop


        for (int w:a) {

            if (w>=0){

                minPositive = Math.min(minPositive,w);

            }

            if (w<0){
                maxNegative=Math.max(maxNegative,w);
            }

        }

        System.out.println("minPositive = " + minPositive);  //minPositive = 18
        System.out.println("maxNegative = " + maxNegative);  //maxNegative = -2


        //2.way: For loop fantastic

        int[] b=new int[]{-12, -5, -2, 18, 23};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));  //[-12, -5, -2, 18, 23]


        for (int i = 0; i <b.length ; i++) {
            if (b[i]<0 && b[i+1]>0){
                System.out.println("MaxNegative: "+b[i]);   //MaxNegative: -2
                System.out.println("MinPositive: "+b[i+1]);  //MinPositive: 18
            }

        }












    }
}
