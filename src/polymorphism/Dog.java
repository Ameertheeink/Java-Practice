package polymorphism;

public class Dog extends Animal{
    // Overriding the makeSound method in the superclass
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Overloaded method with different parameters in the subclass
    public void makeSound(int count, String barkType) {
        for (int i = 0; i < count; i++) {
            System.out.println("Dog is barking: " + barkType);
        }
    }
}
