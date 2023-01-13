package day04_stringmanipulations;

public class InterviewQuestion01 {

    public static void main(String[] args) {

        //Example 1: Type to swap the integers
        //           a=12 and b=5 ==> a=5 and b=12

        int a= 12;
        int b= 5;

        System.out.println("Before swapping: "+a+ " "+b );

        int temp= 0;
        //1 step
        temp=a;

        //2 step
        a=b;

        //3 step
        b=temp;

        System.out.println("After swapping: "+a+" "+b);


        //2. way: do not create 3rd variable

        int x=12;
        int y=5;
        System.out.println("Before swapping: "+x+" "+y);


        x=x+y; //17
        y=x-y; //12
        x=x-y; //5

        System.out.println("After swapping: "+x+" "+y);


        //practice


        int q=15;
        int w=25;
        int container=0;

        System.out.println("Before swapping: "+q+" "+w);

        container=q;
        q=w;
        w=container;

        System.out.println("After swapping: "+q+" "+w);


        //second way

        //now q=25 w=15 beacuse we already swapped them before here

        q=q+w;  //40
        w=q-w;  //15
        q=q-w;  //25

        System.out.println("After: "+q+" "+w);

        int z=30;
        int c=50;
        int container2=0;

        System.out.println("Before swapping: "+z+" "+c);

        container2=z;
        z=c;
        c=container2;

        System.out.println("After swapping: "+z+" "+c);

























    }
}
