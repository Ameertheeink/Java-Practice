package abtract;

public class Cat extends Animal{
    public void run(){
        System.out.println("Run Fast");
    }
    public void makenoise(){
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.makenoise();
        cat.run();
    }

}
