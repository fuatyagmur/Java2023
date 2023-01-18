package day08_ternaryswitch;

import java.io.Serializable;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Type code to select the minimum one of two integers
        int a= 34;
        int b= 5;

        //1.way:
        String r1= String.valueOf(a<b ? a :b);
        System.out.println("r1 = " + r1);

        int ra=a<b ? a :b;
        System.out.println("Minimum value is: " + ra);

        //2. way

        if (a<b){
            System.out.println("a is minimum");
        }else {
            System.out.println("b is minimum");
        }


        //Example 2: Type code to calculate absolute value of an integer
        //  5  ==> 5     -  0 ==> 0      -5 ==> -1 * -5==> 5

        int c= -5;

        int r2= c<0 ? -1*c : c;
        System.out.println("Absolute value is: " + r2);

        //Example 3:If two integers are positive return the multiplication
        //         Otherwise, give a message like "I do not know how to multiply"
        //         3 and 4  ==> 12   -   -3  and -4 =>"I do not know how to multiply"

        int d=-3;
        int e=4;

        Object r3= d>0 && e>0 ? d*e : "I do not know how to multiply";
        System.out.println("r3 = " + r3);

        // or

        Serializable sr = d > 0 && e > 0 ? d * e : "I do not know how to multiply";
        System.out.println("sr = " + sr);


    }

}
