package day15arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

          /*
             Ask user to enter a letter
             If the letter exists in the list convert it to 'X'
             otherwise, add the element user entered into the list
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please write a letter...");
        char letter=input.next().charAt(0);
        letter=Character.toUpperCase(letter);


        List<Character> myList=new ArrayList<>();
        myList.add('J');
        myList.add('A');
        myList.add('V');
        myList.add('A');
        System.out.println("myList = " + myList);   //myList = [J, A, V, A]

        if (myList.contains(letter)){
            myList.set(myList.indexOf(letter),'X');
        }else {
            myList.add(letter);
        }

        System.out.println("myList = " + myList);


    }
}
