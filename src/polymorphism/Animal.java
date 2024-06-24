package polymorphism;

public class Animal {
    public void makeSound() {
        System.out.println("Generic Animal Sound");
    }
    public void makeSound(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Generic Animal Sound");
        }
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.makeSound();
    }
}
