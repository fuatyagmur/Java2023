package practices.array;

public class array05 {

    public static void main(String[] args) {

       // Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
        //Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM

        String[] a=new String[]{"Kemal","Jonathan","Mark","Jackson","Ali"};
        String initials="";

        for (String w:a) {
            if (w.endsWith("k") || w.endsWith("n")){
                initials=initials+w.substring(0,1);
            }

        }

        System.out.println("initials = " + initials);




        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        String initials2 = "";
        for(String w : b){
            if(w.endsWith("k") || w.endsWith("n")){
                initials2 = initials2 + w.substring(0,1); }
        }
        System.out.println(initials2);


    }
}
