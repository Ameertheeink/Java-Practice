package forEach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleTwo {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(9,8,7,6,5,4,3,2,1);

//        Stream<Integer> data=numbers.stream();

        numbers.stream()
                .filter(n->n%2==1)
                .sorted()
                .map(n->n*2)
                .forEach(n->System.out.println(n));
//        Stream<Integer> sortedData=data.sorted();
//        System.out.println(   data.count());
//        data.forEach(n->System.out.println(n));
//        sortedData.forEach(n->System.out.println(n));





//        numbers.forEach(n->System.out.println(n*5));
    }
}
