package practices.array;

import java.util.Arrays;

public class array02 {
    public static void main(String[] args) {

        //        Find the middle element in an integer array Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        //        (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10

        int [] arr=new int[]{12,45,3,9,8,11};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //[3, 8, 9, 11, 12, 45]

        if (arr.length%2!=0){
            int midElement= arr[arr.length/2];
            System.out.println(arr[midElement]);
        }else {
            int midElement= arr[arr.length/2];
            int secondMidElement=arr[arr.length/2-1];
            int average=(midElement+secondMidElement)/2;
            System.out.println("average = " + average);

        }



//        if (array.length % 2 == 0) {
//            int middle1 = array[array.length / 2 - 1];
//            int middle2 = array[array.length / 2];
//            return (middle1 + middle2) / 2;
//        } else {
//            return array[array.length / 2];
//        }







    }
}
