package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {


        //Example 1: Create a String list, add 5 elements into the list, remove a specific element from the list.

        List<String> names = new ArrayList<>();
        names.add("Christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");

        System.out.println(names);  //[Christian, Alex, Tommy, Adriana, Tom]

        boolean isRemoved=names.remove("Alex");
        System.out.println(isRemoved);  //true
        System.out.println(names);  //[Christian, Tommy, Adriana, Tom]

        String removedElement=names.remove(2);
        System.out.println(removedElement);  //Adriana
        System.out.println(names); // [Christian, Tommy, Tom]

        //Example 2: Create an Integer List, add 6 elements into it, remove a specific element
        List<Integer> ages=new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(62);
        ages.add(142);
        ages.add(34);
        ages.add(63);
        System.out.println("ages = " + ages);  //ages = [12, 13, 62, 142, 34, 63]


        ages.remove((Integer)13);
        System.out.println("ages = " + ages);  //ages = [12, 62, 142, 34, 63]

       boolean isDeleted= ages.remove((Integer)56);
        System.out.println(isDeleted);  //false
        System.out.println("ages = " + ages);   //ages = [12, 62, 142, 34, 63]



        //Example 3: Create a String list, add 5 elements into it, remove the elements whose length is less than 6

        List<String> n=new ArrayList<>();
        n.add("Christiana");
        n.add("Tommy");
        n.add("Alex");
        n.add("Alexandra");
        n.add("Tiffany");

        System.out.println("n = " + n);  //n = [Christiana, Tommy, Alex, Alexandra, Tiffany]


        // 1. way
        n.removeIf(w -> w.length() < 6);
        System.out.println("n = " + n);   //n = [Christiana, Alexandra, Tiffany]

        //2.way
        for (int i = 0; i <n.size() ; i++) {
            if (n.get(i).length()<6){
                n.remove(n.get(i));

                i--;

            }

        }
        System.out.println("n = " + n);  //n = [Christiana, Alexandra, Tiffany]


        //3.way  clone
        List<String> clonedN=new ArrayList<>(n);

        for (String w:clonedN) {
            if (w.length()<6){
                n.remove(w);
            }

        }

        System.out.println("n = " + n);  //n = [Christiana, Alexandra, Tiffany]


    }
}
