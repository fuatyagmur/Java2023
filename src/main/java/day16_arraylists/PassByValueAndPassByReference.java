package day16_arraylists;

public class PassByValueAndPassByReference {
    public static void main(String[] args) {

        int shirtPrice=100;

        System.out.println(studentShirtPrice(shirtPrice, 10));  //90


    }

    public static int studentShirtPrice(int shirtPrice, int discount){

        return shirtPrice- discount;

    }






}
