package overriding;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Nom nom nom");
    }
}
