package practices.array;

import java.util.Arrays;

public class array06 {

    public static void main(String[] args) {

        //Find the total number of characters used in String array elements
        //Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

        String[] a=new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));  //[Angie, Jonathan, Kemal, Mark, Veli]

        int sum=0;

        for (String w:a) {
           sum= sum + w.length();

        }
        System.out.println("sum = " + sum);  //sum = 26


        //Find the total number of characters used in String array elements
        //Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26

        String[] b=new String[]{"jonathan","joe","thijs","tomas","wisse","jochem"};
        int total=0;

        for (String w:b) {
           total= total + w.length();


        }

        System.out.println("total = " + total);  //total = 32


    }
}
