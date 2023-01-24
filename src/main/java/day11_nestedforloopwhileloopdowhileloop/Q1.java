package day11_nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class Q1 {


    public static void main(String[] args) {


      int i=12;


      while (i<67){
          if (i%2 == 1){
              System.out.print(i + " ");
          }

          i++;
      }

        System.out.println();

        //Example 3: Type code to find the sum of integers from 12 to 67

        int k=12;

      int sum=0;

      while (k<68){
          sum=sum + k;

          k++;
      }

        System.out.println("sum = " + sum);



      int f=1;
      int sumOdd=0;
      int sumEven=0;

      while (f<11){
          if (f%2 != 0 ){
              sumOdd=f+ sumOdd;

             // sumOdd+=i;


          }else if (f%2 == 0){
              sumEven=f+sumEven;

            //  sumEven+=i;


          }else {
              System.out.println("Please enter a valid number...");
          }

          f++;
      }

        System.out.println("sum of odd numbers: "+ sumOdd);
        System.out.println("sum of even numbers: "+sumEven);







        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number... ");
        int d= input.nextInt();

        int sumOfOdd=0;
        int sumOfEven=0;




        while (d<11){
            if (d%2 != 0 ){
                sumOfOdd=d+ sumOfOdd;

                // sumOdd+=i;


            }else if (d%2 == 0){
                sumOfEven=d+sumOfEven;

                //  sumEven+=i;


            }else {
                System.out.println("Please enter a valid number...");
            }

            d++;
        }

        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumOfEven = " + sumOfEven);


    }
}
