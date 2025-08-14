package single.level;

public class Dog extends Animal{
    // Overriding method from parent class
    public void makeSound() {
        System.out.println("Woof!");
        super.makeSound(); // Same method from parent class
    }
}
