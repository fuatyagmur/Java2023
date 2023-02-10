package practices.array;

public class array10 {

    public static void main(String[] args) {

       // Type code to find array elements whose first and last characters are same

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int size = arr.length;

        for(Integer i=0; i<size; i++){
            String firstChar = arr[i].substring(0, 1);
            //System.out.println(firstChar);
            String lastChar = arr[i].substring(arr[i].length()-1);
            //System.out.println(lastChar);

            if(firstChar.equals(lastChar)){
                System.out.println(arr[i]); }
        }



        System.out.println();

        //2. way

        String[] arr2 = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        for (String s:arr2) {

            if (s.charAt(0) == s.charAt(s.length()-1)){
                System.out.println(s);
            }
            
        }

        System.out.println();


        //1.way again

        String[] arr3 = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for (int i = 0; i <arr3.length ; i++) {
            String firstLetter=arr[i].substring(0,1);
            String lastLetter=arr[i].substring(arr[i].length()-1);

            if (firstLetter.equals(lastLetter)){
                System.out.println(arr[i]);
            }

        }


    }
}
