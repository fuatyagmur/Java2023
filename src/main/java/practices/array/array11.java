package practices.array;

public class array11 {

    public static void main(String[] args) {

        //Type code to find if a given element exists in a given array or not

        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s = "object";

        //1.way

        int counter = 0;
        for(String w : arr){
            if(w.equalsIgnoreCase(s)){ counter++;
            } }
        if(counter>0){ System.out.println(s + " exists");
        }else{
            System.out.println(s + " does not exist");

        }

        //2.way

        //Type code to find if a given element exists in a given array or not

        String[] arr2 = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s2 = "object";

        boolean elementExists=false;

        for (String w:arr2) {

            if (w.equals(s2)) {
                elementExists = true;
                break;
            }
        }

            if (elementExists){
                System.out.println("exist");
            }else {
                System.out.println("doesnt exist");
            }






        //3.way
        String[] arr3 = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s3 = "object";


        int counter3=0;

        for (String w:arr3) {

            if (w.equalsIgnoreCase(s3)){
                counter3++;
                //System.out.println("Exist3");  --> Exist3
            }

        }

        if (counter3>0){
            System.out.println("Exists3");
        }else {
            System.out.println("Doesn't exists3");
        }






    }
}
