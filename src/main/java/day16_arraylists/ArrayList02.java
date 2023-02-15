package day16_arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {


        //Example 1: Create a salary list and increase the salary %10 if the salary is less than 5000 dollars.
        //           [4500, 6400, 2300, 5000, 7150] ==> 4500-->4950 - 2300-->2530
        //           [4950, 6400, 2530, 5000, 7150]

        List<Double> salaries= new ArrayList<>();

        salaries.add(4500.00);
        salaries.add(6400.00);
        salaries.add(2300.0);
        salaries.add(5000.00);
        salaries.add(7150.00);
        System.out.println(salaries);//[4500, 6400, 2300, 5000, 7150]

//        //1.way:
//        for (Double w: salaries){
//            if (w <5000)
//            salaries.set(salaries.indexOf(w), w*1.1);
//        }
//        System.out.println(salaries);

        //2.way:

        for (Double w: salaries){

            if (w>=5000){
                continue;
            }else {
                salaries.set(salaries.indexOf(w), w*1.1);
            }

        }
        System.out.println(salaries);



        //Example 1: Create a salary list and increase the salary %10 if the salary is less than 5000 dollars.
        //           [4500, 6400, 2300, 5000, 7150] ==> 4500-->4950 - 2300-->2530
        //           [4950, 6400, 2530, 5000, 7150]

        List<Double> salary = new ArrayList<>(Arrays.asList(4500.00, 6400.00, 2300.00, 5000.00, 7150.00));
        List<Double> newSalary = new ArrayList<>();

        for (Double s : salary) {
            if (s < 5000) {
                newSalary.add(s * 1.1);
            } else {
                newSalary.add(s);
            }
        }

        System.out.println("New salary = " + newSalary);


    }
}
