package overriding;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Yum yum yum");
    }
}
