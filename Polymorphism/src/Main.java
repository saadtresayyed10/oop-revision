import overloading.*;
import overriding.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        Shapes shapes = new Shapes();
        Square square = new Square();
        RightAngleTriangle rightAngleTriangle = new RightAngleTriangle();


        // Overriding
        animal.eat();
        dog.eat();
        cat.eat();

        //Overloading
        System.out.println(shapes.sideSum());
        System.out.println(square.sideSum(2));
        System.out.println(rightAngleTriangle.sideSum(2, 3, 6));

    }
}