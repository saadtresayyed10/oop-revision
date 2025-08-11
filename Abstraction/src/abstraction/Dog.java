package abstraction;

// Either make child class abstract or define abstracted method from parent
public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

}
