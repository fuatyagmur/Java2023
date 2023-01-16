package day07_ifstatementternarystatement;

public class IfStatement01 {

    public static void main(String[] args) {
    // Type code to check if a given character is upper case or lower or others
        char ch='S';

        if (ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }else if (ch>= 'a' && ch<='z'){
            System.out.println("Lover case");
        }else {
            System.out.println("Others ...");
        }



        //if a number is less than 300 or greater than 3000
        //print "perfect number" on the console
        //otherwise print "Regular number"

        int num=3200;

        if (num<300 || num>3000){
            System.out.println("Perfect number");
        }else {
            System.out.println("Regular number");
        }


        //Ex 3: Type code to check if a number is "Even" or "Odd"

        int n=8;

        if (n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }


        //Ex 4: Type code to print the number of the month for the given month name
        // february-->2     May-->5     December-->12        Tom-->Invalid month name

        String monthName="may";

        if (monthName.equalsIgnoreCase("January")){
            System.out.println("1");
        }else if (monthName.equalsIgnoreCase("February")){
            System.out.println("2");
        }else if (monthName.equalsIgnoreCase("March")){
            System.out.println("3");
        }else if (monthName.equalsIgnoreCase("April")){
            System.out.println("4");
        }else if (monthName.equalsIgnoreCase("May")){
            System.out.println("5");
        }else if (monthName.equalsIgnoreCase("June")){
            System.out.println("6");
        }else if (monthName.equalsIgnoreCase("July")){
            System.out.println("7");
        }else if (monthName.equalsIgnoreCase("August")){
            System.out.println("8");
        }else if (monthName.equalsIgnoreCase("September")){
            System.out.println("9");
        }else if (monthName.equalsIgnoreCase("October")){
            System.out.println("10");
        }else if (monthName.equalsIgnoreCase("November")){
            System.out.println("11");
        }else if (monthName.equalsIgnoreCase("December")){
            System.out.println("12");
        }else {
            System.out.println("Invalid month name");
        }

    }

}
