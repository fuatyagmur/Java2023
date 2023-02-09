package practices.array;

public class array11 {

    public static void main(String[] args) {

        //Type code to find if a given element exists in a given array or not

        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"}; String s = "object";
        int counter = 0;
        for(String w : arr){
            if(w.equalsIgnoreCase(s)){ counter++;
            } }
        if(counter>0){ System.out.println(s + " exists");
        }else{
            System.out.println(s + " does not exist");
        }




    }
}
