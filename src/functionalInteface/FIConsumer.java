package functionalInteface;
//consumer modifies data
import java.util.function.Consumer;

class Person{
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class FIConsumer {
    public static void main(String[] args) {
Person p=new Person();
        Consumer<Person> setName=t->t.setName("Play with Java");
        setName.accept(p);
        System.out.println(p.getName());
    }
}
