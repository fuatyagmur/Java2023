package practices.array;

public class array10 {

    public static void main(String[] args) {

       // Type code to find array elements whose first and last characters are same

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"}; int size = arr.length;
        for(Integer i=0; i<size; i++){
            String firstChar = arr[i].substring(0, 1);
            String lastChar = arr[i].substring(arr[i].length()-1); if(firstChar.equals(lastChar)){
                System.out.println(arr[i]); }
        }


    }
}
