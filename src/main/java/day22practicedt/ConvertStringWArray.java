package day22practicedt;

import java.util.Arrays;

public class ConvertStringWArray {

    public static void main(String[] args) {


        String str="Congratulations";

        String arr[]= str.split("");

        System.out.println(Arrays.toString(arr)); //[C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]

        String strNew="";


        for (int i = arr.length-1 ; i >=0 ; i--) {

            if (arr[i].equalsIgnoreCase("a") || arr[i].equalsIgnoreCase("o")||
            arr[i].equalsIgnoreCase("u") || arr[i].equalsIgnoreCase("i")){

               arr[i]="*";
            }

            strNew=strNew+arr[i];

        }

        System.out.println(strNew);  //sn**t*l*t*rgn*C


    }


}
