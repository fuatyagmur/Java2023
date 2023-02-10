package practices.array;

import java.util.Arrays;

public class array13 {

    public static void main(String[] args) {

       // Type code to put all zeros to end in an integer array.
        // Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        Integer[] arr=new Integer[]{5,0,2,0,3};
        Integer[] brr=new  Integer[arr.length];
        System.out.println(Arrays.toString(arr));  //[5, 0, 2, 0, 3]

        int firstIndex=0;
        int lastIndex=arr.length-1;


        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=0){
                brr[firstIndex]=arr[i];
                firstIndex++;

            }else {
                brr[lastIndex]=0;
                lastIndex--;
            }

        }

        System.out.println(Arrays.toString(brr));  //[5, 2, 3, 0, 0]



        // Type code to put all zeros to end in an integer array.
        // Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        Integer[] arr2=new Integer[]{6,2,4,9,0,5,0,3};
        Integer[] brr2=new Integer[arr2.length];

        int fIdx=0;
        int lIdx=arr2.length-1;

        for (int i = 0; i <arr2.length ; i++) {
            if (arr2[i]!=0){
                brr2[fIdx] =arr2[i];

                 fIdx++;

            }else {
                brr2[lIdx]= 0;

                lIdx--;

            }

        }

        System.out.println(Arrays.toString(brr2));  //[6, 2, 4, 9, 5, 3, 0, 0]


        // Type code to put all zeros to end in an integer array.
        // Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        Integer[] arr3=new Integer[]{0,4,2,6,8};
        Integer[] brr3=new Integer[arr3.length];

        int firstIdx=0;
        int lastIdx= arr3.length-1;

        for (int i = 0; i <arr3.length ; i++) {

            if (arr3[i]!=0){
                brr3[firstIdx]=arr3[i];

                firstIdx++;
            }else {
                brr3[lastIdx]=0;
                lastIdx--;
            }

        }
        System.out.println(Arrays.toString(brr3));  //[4, 2, 6, 8, 0]

        /*Fault we should use fori

        Integer[] arr4=new Integer[]{0,4,2,6,8,3,0,9};
        Integer[] brr4=new Integer[arr4.length];

        int first=0;
        int last= arr4.length-1;

        for (Integer w:arr4) {
            if (arr4[w]!=0){
                brr4[first]=arr4[w];

                first++;
            }else {
                brr4[last]=0;

                last--;
            }

        }

        System.out.println( Arrays.toString(brr4));

         */





    }
}
