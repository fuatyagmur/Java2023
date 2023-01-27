package day11_nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {


         /*
            Username is "admin", Password is "pwd123"

            Ask user to enter username and password
            User should see "Enter your username and password" message

            If user enters correct credentials, he should get "You are in your account!" message

            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message
	   */

        Scanner input= new Scanner(System.in);

        int counter=0;

        do {

            if (counter==3){
                System.out.println("Your account is blocked");
                break;

            }

            System.out.println("Enter your username");
            String username=input.nextLine();
            System.out.println("Enter your password");  // for string manipulation we are using string not int
            String password=input.next();

            if (username.equals("admin") && password.equals("pwd123")){

                System.out.println("You are in your account!");
                break;

            }else {
                System.out.println("your username or password is wrong");
            }

            counter++;

        }while (true);

















    }
}
