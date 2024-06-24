package polymorphism;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
    public void makeSound(String purrType) {
        System.out.println("Cat is purring: " + purrType);
    }
}
