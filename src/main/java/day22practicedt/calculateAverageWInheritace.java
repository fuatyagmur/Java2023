package day22practicedt;

public class calculateAverageWInheritace {

     /*
     Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
     */

    public static void main(String[] args) {

        calculateAverage("Ali",34,23,53,78,98,97);
        calculateAverage("Fuat",76,95,87,80,99);

    }

    public static void calculateAverage(String name,double ... mark){

        double sum=0;
        for (double w: mark) {

            sum += w;

        }

        //System.out.println(sum / mark.length);
        System.out.println(name +  "'s Average exam result is: " + (String.format("%.2f",sum/mark.length)));


    }


}
