package day12_arrays;

public class Q5 {

    public static void main(String[] args) {

        //Example 1: Create a String array with 5 elements, delete the elements whose length is less than 5
        //           [Orange, Blue, Red, Yellow, Brown] ==> [Orange, Yellow, Brown]
        String[] colors = {"Orange", "Blue", "Red", "Yellow", "Brown"};
        int count = 0;

        for (int i = 0; i < colors.length; i++) {
            if (colors[i].length() >= 5) {
                colors[count++] = colors[i];
            }
        }

        String[] filteredColors = new String[count];
        System.arraycopy(colors, 0, filteredColors, 0, count);

        for (String color : filteredColors) {
            System.out.println(color);
        }
    }
}
