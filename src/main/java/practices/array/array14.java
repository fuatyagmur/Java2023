package practices.array;

import java.util.Arrays;
import java.util.Scanner;

public class array14 {

    public static void main(String[] args) {

        //Create an integer array by getting the elements from the user
        // then print the difference between the smallest and the greatest elements on the console.

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=input.nextInt();

        int[] arr=new int[length];

        System.out.println("Enter " + length + " array elements:");

        for (int i = 0; i <arr.length ; i++) {

            arr[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(arr));  //[8, 4, 1, 7]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //[1, 4, 7, 8]


        System.out.println(arr.length-1); //3   so we should do it arr[arr.length-1] to get last idx of array
        int diffOfBigAndSmall=arr[arr.length-1] - arr[0];
        System.out.println("diffOfBigAndSmall = " + diffOfBigAndSmall);  //diffOfBigAndSmall = 7


    }
}
