package practices.array;

import java.util.Arrays;

public class array01 {

    public static void main(String[] args) {

//        Find the middle element in an integer array Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
//        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

        int[] a=new int[]{12,5,8};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));  //[5, 8, 12]
        System.out.println(a.length/2);  // it gives indexoffirst element

        if (a.length%2!=0){
            Integer IndexOfMiddleElement=a.length/2;
            System.out.println(a[IndexOfMiddleElement]);

        }else {
            Integer IndexOfMiddleElement=a.length/2;
            Integer averageValue=(a[IndexOfMiddleElement]+a[IndexOfMiddleElement-1])/2;
            System.out.println(averageValue);
        }



        int [] c=new int[]{3,7,9,5};
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));  //[3, 5, 7, 9]
        System.out.println(c[c.length/2]);  //17
        System.out.println(c[c.length/2-1]);  //5

        if (c.length%2!=0){
            int indexOfMid=c.length/2;
            System.out.println(c[indexOfMid]);
        }else{
            int indexOfMid=c.length/2;
            int average=(c[indexOfMid]+c[indexOfMid-1])/2;
            System.out.println("average = " + average);
        }

        int [] d = new int[]{13, 17, 19, 15};
        Arrays.sort(d);
        System.out.println(Arrays.toString(d)); // [13, 15, 17, 19]
        if (d.length % 2 == 0) {
            int indexOfMid = d.length / 2;
            int averageD = (d[indexOfMid - 1] + d[indexOfMid]) / 2;
            System.out.println("averageD = " + averageD);
        } else {
            int indexOfMid = d.length / 2;
            System.out.println(d[indexOfMid]);
        }







    }
}
