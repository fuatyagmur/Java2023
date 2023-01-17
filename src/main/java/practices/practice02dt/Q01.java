package practices.practice02dt;

public class Q01 {

    public static void main(String[] args) {

        //Type code to check if a String does not have any space character at the beginning and at the end
        //Example==> ' Ali ' should print true on the console
        //            'Ali' should print false on the console

        String str=" Tom ";
        System.out.println(str.trim()); //Tom without space
        String trimmedString=str.trim();
        boolean result= str.equals(trimmedString);

        System.out.println("Is there any space at the beginning and at the end? " + !result);




















    }
}
