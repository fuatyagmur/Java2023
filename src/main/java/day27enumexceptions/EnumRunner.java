package day27enumexceptions;

import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {


        String capital1=UsStates.TEXAS.getCapital();
        System.out.println("capital1 = " + capital1);

        String abb1=UsStates.ALABAMA.getAbbreviation();
        System.out.println("abb1 = " + abb1);

        System.out.println("UsStates.valueOf(\"TEXAS\").getStateName() = " + UsStates.valueOf("TEXAS").getStateName());

        System.out.println("UsStates.values() = " + Arrays.toString(UsStates.values()));

        for (UsStates w:UsStates.values()) {
            System.out.println(w+"-->"+w.getStateName()+"-->"+w.getAbbreviation()+"-->"+w.getCapital());

        }






    }
}
