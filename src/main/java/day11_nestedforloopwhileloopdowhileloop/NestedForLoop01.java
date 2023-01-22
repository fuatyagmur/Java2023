package day11_nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {

         /*
               Example 1: Type code to get the output like
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
        */
        int numOfRows = 10;

        for(int i=1; i<=numOfRows; i++) {

            for (int k = 1; k <= i; k++) {

                System.out.print(k + " ");

            }
            System.out.println();


        }





        int rowNumber=5;

        System.out.println();

        for (int i=1; i<=rowNumber; i++){



            for (int k=1; k<=i; k++){
                System.out.print(k);

            }

            System.out.println();

        }


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter row number...");

        int rowNum=input.nextInt();

        System.out.println();


        for (int i=1; i<=rowNum; i++){

            for (int k=1; k<=i; k++){

                System.out.print(k+" ");
            }

            System.out.println();
        }

























    }
}
