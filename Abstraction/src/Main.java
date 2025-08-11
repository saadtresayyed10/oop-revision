import abstraction.Animal;
import abstraction.Cat;
import abstraction.Dog;

public class Main {
    public static void main(String[] args) {
        // Can instantiate object with Parent class and child constructor
        Animal dog = new Dog();

        /*
        * Cannot instantiate entirely with parent class
        * Animal dog/cat = new Animal();
        * */

        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

        // Inherit method from parent class
        cat.hungryAnimal();
    }
}