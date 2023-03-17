package day26collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /*
        1)Queues use First In First Out(FIFO) rule
        2)Deque stands for Double Ended Queue it uses FIFO and LIFO(Last In First Out)
     */

    public static void main(String[] args) {


        Queue<String> que=new LinkedList<>();
        que.add("Tom");
        que.add("Ajda");
        que.add("Brad");
        que.add("Jim");

        System.out.println("que = " + que);  //que = [Tom, Ajda, Brad, Jim]
        // ==>Elements are in "insertion order" because I used LinkedList as constructor


        Queue<String> myQue=new PriorityQueue<>();
        myQue.add("Tom");
        myQue.add("Ajda");
        myQue.add("Brad");
        myQue.add("Jim");
        myQue.add("Aaron");
        myQue.add("Cindy");

        System.out.println("myQue = " + myQue);  // [Ajda, Jim, Brad, Tom] ==> Elements are in an "order" according to the Java logic
        // because I used PriorityQueue as constructor.

        Queue<Integer> intQue = new PriorityQueue<>();//PriorityQueue only cares about the first element is the least!
        intQue.add(9);
        intQue.add(5);
        intQue.add(15);
        intQue.add(91);
        intQue.add(-9);

        System.out.println("intQue = " + intQue);
        System.out.println(intQue.remove());//In queue methods are implemented on the first element in order.
        System.out.println("intQue = " + intQue);//[5, 9, 15, 91]


        Deque<String> dq = new LinkedList<>();
        dq.add("Tom");
        dq.add("Ajda");
        dq.add("Brad");
        dq.add("Jim");

        System.out.println(dq);// [Tom, Ajda, Brad, Jim]
        //If you look at the Deque methods, you will notice the methods are in ...first() and ...last()
        //The methods are focusing first and the last elements.


    }
}
