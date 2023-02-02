package day13_arraysmultidimensionalarrays;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in the array or not
        char ch[] = new char[5];
        ch[0] = 'A';
        ch[1] = 'Y';
        ch[2] = 'C';
        ch[3] = 'I';
        ch[4] = 'D';

        //1.Way:

        int counter=0;

        for (char w:ch) {
            if ( w == 'F'){

                counter++;
                break;
            }

        }
        if (counter>0){
            System.out.println("It exists");
        }else {
            System.out.println("It does not exists");
        }


        //2.Way:Use binarySearch() method tells you if the element exists or not in the array
        //      To use binarySearch() method, you have to use sort() first
        Arrays.sort(ch);

        //binarySearch() method gives you the index of existing element after sorting

        int idxY=Arrays.binarySearch(ch, 'Y');
        System.out.println(idxY);  //4

        int idxD=Arrays.binarySearch(ch, 'D');
        System.out.println(idxD);  //2

        int idxX=Arrays.binarySearch(ch,'X');
        System.out.println(idxX);  //-5

        int idxE=Arrays.binarySearch(ch,'E');
        System.out.println(idxE);  //-4


















    }
}
