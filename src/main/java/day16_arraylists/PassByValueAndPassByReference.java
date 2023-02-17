package day16_arraylists;

public class PassByValueAndPassByReference {
    public static void main(String[] args) {

        int shirtPrice=100;

        studentShirtPrice(shirtPrice,10);

        veteranDiscount(shirtPrice,20);

        String name="Ajda";

        String result=putExclamationMark(name);
        System.out.println(result);  //Ajda!
        System.out.println(name);  //Ajda

       double newSalary= increaseSalary(shirtPrice);
        System.out.println(newSalary);  //120.0

        double newSalary2=increaseSalary(1000);
        System.out.println(newSalary2);  //1200.0

        System.out.println(getAbsoluteValue(-5));  //5

        //or

        int abs=getAbsoluteValue(-10);
        System.out.println(abs);  //10


        //Create a method adds two integers
        System.out.println(twoIntegers(3, 8));  //11
        //or
        int resultTwoIntegers=twoIntegers(5,8);
        System.out.println(resultTwoIntegers);  //13


        //Create a method prints the first and the last character on the console
        printFirstAndLast("Hello, world!");

        //Create a method prints the sum of the ASCII values of characters in a String
        System.out.println("sumOfAscii(\"Hello, world!\") = " + sumOfAscii("Hello, world!"));  //1161

        //or

        String str="Hello, world!";
        int sum=sumOfAscii(str);
        System.out.println(sum); //1161


    }

    public static void studentShirtPrice(int shirtPrice, int discount){

        int discountedPrice=shirtPrice-discount;
        System.out.println(discountedPrice); //90

    }

    public static void veteranDiscount(int shirtPrice,int discount){
        int discountedPrice=shirtPrice-discount;
        System.out.println(discountedPrice);  //80
    }

    public static String putExclamationMark(String name){
         return name+"!";
    }

    //Create a method that increases the salary by 20%

    public static double increaseSalary(double salary){
        return salary*1.2;
    }

    //Create a method that calculates the absolute value of an integer
    //   - 5 ==> 5   -   0==> 0

    public static int getAbsoluteValue(int n){
        if (n<0){
            return n*-1;
        }else {
            return n;
        }
    }

    //Create a method adds two integers
    public static int twoIntegers(int a,int b){
        return a+b;
    }



    //Create a method prints the first and the last character on the console

    public static String printFirstAndLast(String str){

        char firstChar=str.charAt(0);
        char lastChar=str.charAt(str.length()-1);

        System.out.println("firstChar = " + firstChar);  //firstChar = H
        System.out.println("lastChar = " + lastChar);  //lastChar = !

       return  str;


    }



    //Create a method prints the sum of the ASCII values of characters in a String
    public static int sumOfAscii(String strAscii){

        int sum=0;

        for (int i = 0; i <strAscii.length() ; i++) {
            char c=strAscii.charAt(i);

            sum+=c;
            
        }
        return sum;

    }





}
