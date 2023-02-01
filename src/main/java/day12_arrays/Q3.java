package day12_arrays;

import java.util.Arrays;

public class Q3 {

    public static void main(String[] args) {

        //Example 1: Create an integer array, add 6 elements in it. Find the sum of all elements.

        int ages[]=new int[6];

        ages[0]=11;
        ages[1]=12;
        ages[2]=13;
        ages[3]=14;
        ages[4]=15;
        ages[5]=16;

        System.out.println(Arrays.toString(ages));  //[11, 12, 13, 14, 15, 16]


        int sum=0;

        for (int w: ages){
            sum=sum+w;

        }
        System.out.println("sum = " + sum);



        //Example 2: Create an integer array, type code to find the sum of the min and the max value.
        //           [12, 45, 9, 56] ==> 9+56=65



        int numbers[]=new int[4];

        numbers[0]=11;
        numbers[1]=15;
        numbers[2]=34;
        numbers[3]=25;

        System.out.println(Arrays.toString(numbers)); //[11, 15, 34, 25]

        Arrays.sort(numbers);  //we re putting numbers from less to more

        System.out.println(Arrays.toString(numbers));  //[11, 15, 25, 34]

        int sumoMinMax=numbers[0] + numbers[numbers.length-1];
        System.out.println("sumoMinMax = " + sumoMinMax);

        //2 way

        int nums[]=new int[4];

        nums[0]=14;
        nums[1]=23;
        nums[2]=3;
        nums[3]=43;

        System.out.println(Arrays.toString(nums));

        int minValues=numbers[0];
        int maxValues=numbers[0];

        for (int w:nums) {
           minValues= Math.min(minValues,w);
           maxValues=Math.max(maxValues,w);
            
        }

        System.out.println(minValues);
        System.out.println(maxValues);

        System.out.println(maxValues+minValues);

    }
}
