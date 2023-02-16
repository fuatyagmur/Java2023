package day16_arraylists;

public class MethodCreation01 {

    public static void main(String[] args) {


        System.out.println(additionOfThreeInts(12, 5, 7));  //24
        System.out.println(subtractIntegers(34, 23));  //11
        System.out.println(multiplyIntegers(39, 23));  //897

        System.out.println(divisionOfInts(10.0, 3.33));  //3.003003003003003


    }

    public static int additionOfThreeInts(int a,int b,int c){
        return a+b+c;

    }

    public static int subtractIntegers(int a,int b){
        return a-b;
    }

    public static int multiplyIntegers(int a,int b){
        return a*b;
    }

    public static double divisionOfInts(double a,double b){
        return a/b;
    }







}
