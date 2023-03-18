package day26collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators01 {
    public static void main(String[] args) {

        List<String> myList=new ArrayList<>();

        myList.add("Tom");
        myList.add("Ajda");
        myList.add("Brad");
        myList.add("Jim");
        myList.add("Aaron");
        myList.add("Cindy");

        System.out.println("myList = " + myList);

       Iterator<String> myItr= myList.iterator();
        System.out.println("myItr.next() = " + myItr.next());  //myItr.next() = Tom
        System.out.println("myItr.hasNext() = " + myItr.hasNext());  //myItr.hasNext() = true
        System.out.println("myItr.next() = " + myItr.next());  //myItr.next() = Ajda
        System.out.println("myItr.hasNext() = " + myItr.hasNext());  //myItr.hasNext() = true
        System.out.println("myItr.next() = " + myItr.next());  //myItr.next() = Brad
        System.out.println("myItr.hasNext() = " + myItr.hasNext());  //myItr.hasNext() = true
        System.out.println("myItr.next() = " + myItr.next());  //myItr.next() = Jim
        System.out.println("myItr.hasNext() = " + myItr.hasNext());  //myItr.hasNext() = true
        System.out.println("myItr.next() = " + myItr.next());  //myItr.next() = Aaron
        System.out.println("myItr.hasNext() = " + myItr.hasNext());  //myItr.hasNext() = true
        System.out.println("myItr.next() = " + myItr.next());  //myItr.next() = Cindy
        System.out.println("myItr.hasNext() = " + myItr.hasNext());  //myItr.hasNext() = false


        //System.out.println("myItr.next() = " + myItr.next());
        // ==>NoSuchElementException because pointer shows nothing/hasNext() method returns false



        List<String> yourList=new ArrayList<>();

        yourList.add("Tom");
        yourList.add("Ajda");
        yourList.add("Brad");
        yourList.add("Jim");
        yourList.add("Aaron");
        yourList.add("Cindy");

        System.out.println("yourList = " + yourList);

        Iterator<String> yourItr= yourList.listIterator();


    }

}




