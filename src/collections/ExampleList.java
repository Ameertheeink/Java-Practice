package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleList {
    public static void main(String[] args) {
        List<String> words =new ArrayList<>();
        words.add("grapes");
        words.add("Apple");
        words.add("orange");

        System.out.println(words);
       List<String> results= words.stream().sorted().collect(Collectors.toList());
        System.out.println(results);
    }
}
