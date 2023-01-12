package practices.practice02;

public class Q05_PrintingNumOneByOne {

    public static void main(String[] args) {

        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use /(division operator) and % (modulus operator ==> give the remainder of a division operation)
        // x: input: 12345  ==> divide and give remainder
        //    output: 1
        //            2
        //            3
        //            4 ==>10 and then %10
        //            5


        int x = 1234;

        int ones = x % 10; //4
        //System.out.println("ones = " + ones);

        int tens = (x/10) % 10;  //3
        //System.out.println("tens = " + tens);

        int honderds = (x/100) % 10;  //2
        //System.out.println("honderds = " + honderds);

        int  thousands = x / 1000; //1
        //System.out.println("thousands = " + thousands);


        System.out.println(thousands+ "\n"  +honderds+ "\n"  +tens+ "\n"  +ones);


    }
}
