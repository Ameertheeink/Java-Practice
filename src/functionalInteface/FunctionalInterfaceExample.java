package functionalInteface;
// predicate boolean values
import java.util.function.Predicate;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Predicate<String> checkLenght=str->str.length()>5;
        System.out.println(checkLenght.test("mother"));
    }
}
