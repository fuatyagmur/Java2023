package day11_nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            String username = "admin";
            String password = "pwd123";
            int attempts = 0;

            do {
                System.out.println("Enter your username and password:");
                String inputUsername = scanner.nextLine();
                String inputPassword = scanner.nextLine();

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    System.out.println("You are in your account!");
                    break;
                } else {
                    attempts++;
                    if (attempts == 3) {
                        System.out.println("Your account is blocked.");
                        break;
                    }
                }
            } while (attempts < 3);
        }










    }

