package practices.array;

public class array07 {

    public static void main(String[] args) {

        //Find the sum of int used in int array elements


        int [] a=new int[]{-4,-1,-7,6,9,8};

        int sum=0;

        for (int w:a) {

            sum=sum + w;

        }

        System.out.println("sum = " + sum);  //sum = 11


        int [] b=new int[]{-4,-1,-7,6,9,8,-11};

        int total=0;

        for (int i:b){
            total += i;
        }

        System.out.println("total = " + total);  //total = 0


    }
}
