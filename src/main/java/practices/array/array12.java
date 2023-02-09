package practices.array;

public class array12 {

    public static void main(String[] args) {

        //Type code to find sum of the number of characters of array elements

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        Integer sum = 0;

        for(String w : arr){
            sum = sum + w.length(); }
        System.out.println(sum);




    }
}
