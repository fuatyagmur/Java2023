package day20inheritance;

public class Animal {

     /*
    i) Inheritance prevents following issues;
    Repetitions
    Difficulty in updating codes
    Difficulty in fixing the codes
    Prevents atomic structure

    ii) Child classes can use methods or variables from parent classes but parent classes cannot use
    methods or variables from child classes

    iii)For "public" and "protected" access modifiers, there is no issue in "inheritance".
        For "default" access modifier, if the child and parent class are in the same package inheritance is possible,
        but if the child and parent class are in different packages inheritance is impossible

       For "private" access modifier, inheritance is impossible

       iv) "HAS-A" means "from parent to child, "Is-A" means "from child to parent

     */

    public  void eat(){
        System.out.println("Animals eat ... ");
    }

    public void drink(){
        System.out.println("Animals drink ...");
    }


}
