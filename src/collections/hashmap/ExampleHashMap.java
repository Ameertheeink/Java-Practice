package collections.hashmap;

import java.util.HashMap;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> student=new HashMap<>();
       student.put(1,"ameer");
        student.put(2,"raj");
        student.put(3,"sameer");
        student.put(4,"peer");
        student.put(5,"arun");
        student.put(6,"krishna");


        System.out.println(student);
        System.out.println(student.containsKey(2));
        System.out.println(student.replace(4,"rajini"));
        System.out.println(student);
    }
}
