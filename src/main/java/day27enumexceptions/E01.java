package day27enumexceptions;

public class E01 {

     /*
        1)Exception means "un-expected issue" in coding
        2)When we have Exception we have two ways
            i)We can handle the Exception by using "try-catch block"
            ii)We "Throw Exception" and block the application
        3)We handle the Exception mostly, if you do not handle the Exception
            i)Execution will be stopped
            ii)Application will be blocked
     */


    public static void main(String[] args) {
        System.out.println(divide1(4,2));
        System.out.println(divide1(0,55));
        System.out.println(divide1(6,0));

        System.out.println(divide2(4,0));


    }

    //Example 1: Create a method divides two doubles

    //1.Way: Use if-else but using if-else is not recommended

    public static int divide1(int a, int b){

        if (b==0){
            System.out.println("Divider cannot be 0");
            return 0;

        }else {
            return a/b;
        }

    }


    public static int divide2(int a,int b){
        int result=0;
        try {
            result=a/b;

        }catch (ArithmeticException e){
            System.out.println("Dvider can not be 0");
        }
        return result;

    }





}
