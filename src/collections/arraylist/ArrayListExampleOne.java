package collections.arraylist;

import java.util.ArrayList;

public class ArrayListExampleOne {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(901);
        numbers.add(902);
        numbers.add(903);
        numbers.add(904);
        numbers.add(905);


   if(     numbers.contains(902)){
       System.out.println(numbers.indexOf(902)+1);
   }


        if (numbers.isEmpty()) {
            System.out.println("No data");
        } else {
            for (int num : numbers) {


                System.out.println(num);
            }
        }


    }
}
