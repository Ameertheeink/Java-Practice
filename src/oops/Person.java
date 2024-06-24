package oops;

public class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public static void main(String[] args) {
        Person p=new Person("ameer",20);
        Person p1=new Person("javid",21);
        System.out.println(p.name);
        p1.setName("kumar");
        System.out.println(p1.name);
    }
}
