package practices.practice01;

public class Q05 {
    // Write a Java program to break an integer into a sequence of individual digits.
    // Hint: use / and %
    // x: input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5
    public static void main(String[] args) {
        int number = 12345;

        int ones = number%10;

        int tens = (number/10)%10;

        int hundreds = (number/100)%10;

        int thousends = (number/1000)%10;

        int tenThousends = number/10000;

        System.out.println(tenThousends+"\n"+thousends+"\n"+hundreds+"\n"+tens+"\n"+ones);





        int a=123456;
        int b= a%10; //6
        int c= (a/10)%10; //5
        int d= (a/100)%10; //4
        int e= (a/1000)%10; //3
        int f= (a/10000)%10; //2
        int g= (a/100000)%10; //1

        System.out.println("second exc: "+"\n"+g+"\n"+f+"\n"+e+"\n"+d+"\n"+c+"\n"+b);

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);


    }
}